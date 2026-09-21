package Problems;
// Given an array and a target, find two numbers whose sum equals the target
public class BruteForce {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,8,9,10};
        int target = 9;
        for(int i = 0; i<arr.length; i++){
            for(int j =i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("Numbers found");
            System.out.println("Number 1: " + arr[i]);
            System.out.println("Number 2: " + arr[j]);
                }
            }
        }
    }
}
