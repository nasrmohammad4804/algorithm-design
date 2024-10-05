import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 8,7,3,5,4};
        System.out.println(Arrays.toString(findMaxBalanceDifference(numbers,0,numbers.length-1)));
    }

    private static int[] findMaxBalanceDifference(int[] numbers, int start, int end) {

        if (end==start)
            return new int[]{start,end};

        int mid = (start + end) / 2;

        int[] leftMaxBalanceDifference = findMaxBalanceDifference(numbers, start, mid);
        int[] rightMaxBalanceDifference = findMaxBalanceDifference(numbers, mid + 1, end);

        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = 0;

        int minValue = Integer.MAX_VALUE;
        int minValueIndex = 0;

        for (int index = mid, counter = 0; index >= start; index--, counter--) {

            if (numbers[index] + counter > maxValue) {
                maxValue = numbers[index] + counter;
                maxValueIndex = index;
            }
        }
        for (int index = mid + 1, counter = -1; index <= end; index++, counter--) {
            if (numbers[index] + counter < minValue) {
                minValue = numbers[index] + counter;
                minValueIndex = index;
            }
        }
        return getMax(numbers, leftMaxBalanceDifference, rightMaxBalanceDifference, new int[]{maxValueIndex, minValueIndex});

    }

    private static int[] getMax(int[] numbers, int[] leftMaxBalanceDifference, int[] rightMaxBalanceDifference, int[] middle) {

        int leftMax = (numbers[leftMaxBalanceDifference[0]] - numbers[leftMaxBalanceDifference[1]]) - (leftMaxBalanceDifference[1] - leftMaxBalanceDifference[0]);
        int rightMax = (numbers[rightMaxBalanceDifference[0]] - numbers[rightMaxBalanceDifference[1]]) - (rightMaxBalanceDifference[1] - rightMaxBalanceDifference[0]);
        int middleMax = (numbers[middle[0]] - numbers[middle[1]]) - (middle[1] - middle[0]);

        if (leftMax > rightMax) {

            if (leftMax > middleMax)
                return leftMaxBalanceDifference;

        } else {

            if (rightMax > middleMax)
                return rightMaxBalanceDifference;

        }
        return middle;

    }
}
