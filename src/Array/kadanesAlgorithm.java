package Array;

public class kadanesAlgorithm {
    public static void main(String[] args){
        int[] arr = {-2, 3, -1, 4, -5};
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;
        for(int i=0; i<arr.length; i++){
            currentSum += arr[i];
            if(currentSum>maxSum){
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if(currentSum < 0){
                currentSum = 0;
                tempStart = i+1;
            }
        }
        System.out.println("MaxSum: " + maxSum);
        System.out.print("MaxSubArray: ");
        for(int i= start; i<=end; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
