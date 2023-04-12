package permutationCombination;

public class Combination {
    // 중복 조합
    // 서로 다른 n개에서 순서 없이, 중복이 가능하게 r개를 뽑는 경우의 수
    public static void combination(int[] arr, boolean[] visited, int start, int depth, int r){
        if(depth == r){
            for(int i=0; i<arr.length; i++){
                if(visited[i]) System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for(int i=start; i<arr.length; i++){
            if(!visited[i]){
                visited[i] = true;
                combination(arr, visited, i+1, depth+1, r);
                visited[i] = false;
            }
        }
    }
    // 조합
    // 서로 다른 n개에서 순서 없이 r개를 뽑는 경우의 수
    public static void duplicationCombination(int[] arr, int[] out, int start, int depth, int r){
        if(depth == r){
            for(int num : out) System.out.print(num);
            System.out.println();
            return;
        }
        for(int i=start; i<arr.length; i++){
            out[depth] = arr[i];
            duplicationCombination(arr, out, i, depth+1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int r = 2;
        combination(arr, new boolean[arr.length], 0, 0, r);
        duplicationCombination(arr, new int[r], 0, 0, r);
    }
}
