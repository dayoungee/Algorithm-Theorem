package permutationCombination;

public class Permutation {
    // 중복 순열
    // 서로 다른 n개에서 중복이 가능하게 r개를 뽑아서 정렬하는 경우의 수
    public static void duplicationPermutation(int[] arr, int[] out, int depth, int r){
        if(depth == r){
            for(int num: out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            out[depth] = arr[i];
            duplicationPermutation(arr, out, depth+1, r);
        }
    }
    //순열
    //서로 다른 n개에서 r개를 뽑아서 정렬하는 경우의 수
    public static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r){
        if(depth == r){
            for(int num: out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                out[depth] = arr[i];
                permutation(arr, out, visited, depth+1, r);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        int r = 2;
        permutation(arr, new int[r], new boolean[arr.length], 0, r);
        duplicationPermutation(arr, new int[r], 0, r);
    }

}
