import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] data = {4,9,2,3,8};
        MergeSort mergeSort = new MergeSort();

        System.out.println(Arrays.toString(mergeSort.sort(data, 0, data.length - 1)));
    }
}
