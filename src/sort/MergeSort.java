package sort;


//합병 정렬  O(nlogn)
public class MergeSort{
    public void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        mergeSortUtil(arr, left, mid, right);

    }

    private void mergeSortUtil(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int tempIndex = 0;
        //int tempIndex = left;

        int[] temp = new int[right-left+1];
        //int[] temp = new int[arr.length];
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[tempIndex++] = arr[i++];
            } else {
                temp[tempIndex++] = arr[j++];
            }
        }
        /*앞(왼쪽)부분 배열에 원소가 남아있는 경우*/
        while (i <= mid) {
            temp[tempIndex++] = arr[i++];
        }
        /*뒤(오른쪽)부분 배열에 원소가 남아있는 경우*/
        while (j <= right) {
            temp[tempIndex++] = arr[j++];
        }

        int k = 0;
        while(left <= right){
            arr[left++] = temp[k++];
        }
        /*for (int index = left; index < tempIndex; index++) {
            arr[index] = temp[index];
        }*/
    }
}
