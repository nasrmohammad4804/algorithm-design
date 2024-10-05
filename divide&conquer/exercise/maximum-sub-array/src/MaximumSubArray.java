import java.util.Arrays;

public class MaximumSubArray {

    public static int[] getSubArrayWithBruteForceAlgorithm(int[] array){

        int startPosition = 0;
        int endPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int index = 0; index<array.length; index++){

            int sum = array[index];

            if (sum>maxValue){
                startPosition= index;
                endPosition=index;
                maxValue=sum;
            }

            for (int counter = index+1;counter<array.length; counter++){

                sum+=array[counter];

                if (sum>maxValue){
                    startPosition= index;
                    endPosition=counter;
                    maxValue=sum;
                }

            }
        }

        System.out.println("start position is : "+startPosition+" and end position is : "+endPosition);
        return Arrays.copyOfRange(array,startPosition,endPosition+1);
    }
    private static int[] getSubArrayWithDivideAndConquerAlgorithm(int[] array){
        return null;
    }

}
