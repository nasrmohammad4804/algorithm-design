public class DPAlgorithm {

    public int getMacRodCut(int[] input,int unit){
        return calculate(input,unit);
    }
    private int calculate(int[] input, int unit) {

        int[] maxValue = new int[unit];

        for (int index =0 ; index < unit ; index++){

            int sum = 0;
            for (int counter = index; counter>=0; counter--){

                int result =  index - (counter+1);
               result = result<0 ? 0 : maxValue[result];

               int data =  input[counter] + result;
               if (data>sum)
                   sum = data;
            }
            maxValue[index] = sum;
        }

        return maxValue[input.length-1];
    }
}
