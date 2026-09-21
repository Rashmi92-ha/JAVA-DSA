package Array;
public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 4, 5, 7};
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1; i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
        int L= 2;
        int R = 5;
        int sum = prefix[R] - (L>0 ? prefix[L-1] : 0);

        System.out.println("Prefix Sum : " + sum);
    }
}
