public class DCAlgorithm {

    public int getMacRodCut(int[] input, int unit) {

        return calculate(input,unit);
    }

    private int calculate(int[] input, int unit) {

        if (unit<=0)
            return 0;

         int maxValue = Integer.MIN_VALUE;

         for (int index = 0; index < unit; index++) {


           int result =  input[index] + calculate(input,unit - (index+1));
            if (result>maxValue)
                maxValue=result;
        }
         return maxValue;
    }

}
