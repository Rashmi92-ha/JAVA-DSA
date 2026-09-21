package Array;

public class TwoPointers {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 6, 8, 10};
        int target = 10;
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.print("Pair found: " + arr[left] + " + " + arr[right] );
                break;
            } else if (sum>target) {
                right--;
            }else {
                left++;
            }
        }
    }
}
