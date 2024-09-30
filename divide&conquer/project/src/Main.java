import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] data = {5,6,8,4,11,7,3,9};
        MergeSort mergeSort = new MergeSort();

        System.out.println(Arrays.toString(mergeSort.sort(data, 0, data.length - 1)));
    }
}
