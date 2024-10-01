public class Main {

    public static void main(String[] args) {

        int[] data = {1,0,1,0,1,1,0};
        System.out.println(findIndex(0,data.length-1,data));
    }

    private static int findIndex(int start,int end,int[] numbers){

        if (start==end)
            return start;

        int mid = (start+end) /2;
        int leftArrayLength=(mid - start+1);

        if (leftArrayLength%2==0){

            if (numbers[start]==numbers[mid])
                return findIndex(start,mid,numbers);

            return findIndex(mid+1,end,numbers);
        }
        else if(numbers[mid]== numbers[mid+1])
            return mid+1;
        else {
            if (numbers[start]==numbers[end])
                return findIndex(mid+1,end,numbers);

            return findIndex(start,mid,numbers);

        }
    }
}
