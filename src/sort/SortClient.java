package sort;

import java.io.*;


public class SortClient {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{5, 7, 9, 10, 8, 1, 2, 3};

        RadixSort radixSort = new RadixSort();
        radixSort.radixSort(arr);
        System.out.println(arr.toString());

    }
}
