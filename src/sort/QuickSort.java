package sort;

// 퀵 정렬(최선 O(nlogn) 최악 O(N^2) )
public class QuickSort{
    public void quickSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int pivot = quickSortUtil(arr, left, right);
        quickSort(arr, left, pivot - 1);
        quickSort(arr, pivot + 1, right);
    }

    // 피봇 왼쪽
    public int quickSortUtil(int[] arr, int left, int right) {
        int pivot = arr[left];
        int l = left, r = right;
        while(l < r){
            while(arr[r] > pivot && l < r) r--;
            while (arr[l] <= pivot && l < r) l++;
            Sort.swap(arr, l, r);
        }
        Sort.swap(arr, left, l);

        return l;
    }
}
