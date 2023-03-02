package sort;

// 버블 정렬(  O(N^2) )
public class BubbleSort {
    public int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) Sort.swap(arr, j, j + 1);
            }
        }
        return arr;
    }
}
