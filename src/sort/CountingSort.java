package sort;

// 카운팅(계수) 정렬  O(N)
public class CountingSort {
    public void countingSort(int[] arr){
        // 문제에 나온 index 범위 만큼 배열 크기 할당
        boolean[] temp = new boolean[2001];

        for(int i = 0; i < arr.length; i++){
            temp[arr[i]] = true;
        }

        for(int i = 0; i < temp.length; i++){
            if(temp[i]) System.out.println(i);
        }
    }
}
