package Array;

public class VariableSlidingWindow {
    public static void main(String[] args){
        int[] arr = {2,3,5,4,3,2,1};
        int target = 7;
        int left = 0;
        int sum = 0;
        int minlength = arr.length+1;
        int start = 0;
        int end = 0;

        for(int right= 0 ; right< arr.length; right++){
            sum += arr[right]; //Expanding
        while (sum >= target){
            int currentLength = right-left + 1;
            if(currentLength < minlength){
                minlength = currentLength;
                start = left;
                end = right;
            }
            sum -= arr[left]; //Shrinking
            left++;
        }
        }
        System.out.println("MinLength: " + minlength);
        System.out.println("Smallest SubArray: ");
        for(int i =start; i<=end ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
