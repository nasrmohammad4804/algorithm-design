public class Main {
    public static void main(String[] args) {

        int[] numbers= {4,5,6,10,7,8,1,9};
        System.out.println(maxProfit(numbers,0,numbers.length-1));
    }

    private static int maxProfit(int[] numbers,int start,int end){

        if (start==end)
            return 0;

        int mid = (start + end) / 2;

        int leftProfit = maxProfit(numbers,start,mid);
        int rightProfit = maxProfit(numbers,mid+1,end);

        int minValueIndex = mid;
        int maxValueIndex = mid+1;

        for (int index = minValueIndex; index>=start; index--){
            if (numbers[index]<numbers[minValueIndex])
                minValueIndex = index;
        }
        for (int index = maxValueIndex; index<=end; index++){
            if (numbers[index]>numbers[maxValueIndex])
                maxValueIndex=index;
        }
        return getMax(leftProfit,rightProfit,numbers[maxValueIndex] - numbers[minValueIndex]);



    }

    private static int getMax(int leftProfit, int rightProfit, int middle) {
        return Math.max(Math.max(leftProfit,rightProfit),middle);
    }
}
