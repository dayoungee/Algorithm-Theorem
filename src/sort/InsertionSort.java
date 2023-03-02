package sort;

// 삽입 정렬(  O(N^2) )
public class InsertionSort {

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) arr[j + 1] = arr[j];
                else break;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
