public class MergeSort {

    public int[] sort(int[] data, int start, int end) {

        if (start == end)
            return new int[]{data[start]};


        int mid = (start + end) / 2;

        int[] leftHalf = sort(data, start, mid);
        int[] rightHalf = sort(data, mid + 1, end);

        int[] merge = merge(leftHalf, rightHalf);
        return merge;

    }

    private int[] merge(int[] leftHalf, int[] rightHalf) {

        int firstArrayIndex = 0;
        int secondArrayIndex = 0;
        int index = 0;
        int[] objects = new int[leftHalf.length + rightHalf.length];


        while (firstArrayIndex == leftHalf.length || secondArrayIndex == rightHalf.length) {
            if (leftHalf[firstArrayIndex] <= rightHalf[secondArrayIndex]) {
                objects[index++] = leftHalf[firstArrayIndex++];
            } else {
                objects[index++] = rightHalf[secondArrayIndex++];
            }
        }

        while (true) {

            if (firstArrayIndex == leftHalf.length && secondArrayIndex == rightHalf.length)
                break;

            if (firstArrayIndex == leftHalf.length) {
                objects[index++] = rightHalf[secondArrayIndex++];
            } else if (secondArrayIndex == rightHalf.length) {
                objects[index++] = leftHalf[firstArrayIndex++];
            } else if (leftHalf[firstArrayIndex] <= rightHalf[secondArrayIndex]) {
                objects[index++] = leftHalf[firstArrayIndex++];
            } else {
                objects[index++] = rightHalf[secondArrayIndex++];
            }
        }
        return objects;
    }
}
