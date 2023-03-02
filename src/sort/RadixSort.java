package sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

// 기수 정렬 ( O(N))
public class RadixSort {

    public void radixSort(int[] arr){
        int maxsize = getMaxlength(arr);
        ArrayList<Queue<Integer>> bucket = new ArrayList<>();
        int powed=1;
        int index = 0;
        for(int i=0;i<10;i++)        //버킷 생성
        {
            bucket.add(new LinkedList());
        }

        for(int i=1;i<=maxsize;i++)        //자리수가 가장 큰 수만큼 전체 반복문을 반복합니다.
        {
            for(int j=0;j<arr.length;j++)
            {
                bucket.get((arr[j]/powed)%10).add(arr[j]);    //각 자리수의 맞는 index의 bucket에 넣습니다.
            }
            for(int k=0;k<10;k++)        //버킷에서 데이터를 가지고옵니다.
            {
                int bucket_num = bucket.get(k).size()-1;

                for(int n=0;n<=bucket_num;n++)
                {
                    arr[index] = bucket.get(k).poll();
                    index++;
                }
            }
            index =0;
            powed *=10;
        }

    }
    public int getMaxlength(int[] arr)
    {
        int maxsize = 0;
        for(int i=0;i<arr.length;i++)
        {
            int length = (int)Math.log10((double)arr[i])+1;
            if(maxsize <length)
            {
                maxsize = length;
            }
        }
        return maxsize;            //가장 큰 자리수를 반환합니다.
    }
}
