package sort;

// 선택 정렬(  O(N^2) )
public class SelectSort {
    public int[] selectSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) min = j;
            }
            Sort.swap(arr, i, min);
        }
        return arr;
    }
}
