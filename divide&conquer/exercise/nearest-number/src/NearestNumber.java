public class NearestNumber {

    public int findNearestNumber(int[] numbers, int start, int end, int number) {

        if (start == end)
            return start;

        int mid = (start + end) / 2;

        if (Math.abs(numbers[mid] - number) < Math.abs(numbers[mid + 1] - number))
            return findNearestNumber(numbers, start, mid, number);

        else return findNearestNumber(numbers, mid+1, end, number);
    }

}
