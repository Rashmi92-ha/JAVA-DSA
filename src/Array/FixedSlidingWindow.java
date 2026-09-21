package Array;

public class FixedSlidingWindow {
    public static void main(String[] args){
        int[] arr = {3, 5, 2, 8, 1};
    int k=3;
    int windowSum = 0;
    for(int i =0; i<k; i++) {
        windowSum += arr[i];
    }
    int maxSum = windowSum;
    int start = 0;
    for(int i=k ; i<arr.length; i++){
        windowSum = windowSum - arr[i-k] + arr[i];
        if(windowSum > maxSum){
            maxSum = windowSum;
            start = i - k + 1;
        }
    }
    System.out.println("Maximum Sum: " + maxSum);
    System.out.print("Array: ");
    for(int i = start ; i< start+k ; i++){
        System.out.print(arr[i] + " ");
    }
    }
}
