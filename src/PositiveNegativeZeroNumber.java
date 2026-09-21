public class PositiveNegativeZeroNumber {
    public static void main(String[] args){
        int[] arr = {5, -2, 0, 8, -1, 0, 10};
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i=0; i<arr.length; i++){
         if(arr[i] > 0){
             positiveCount++;
         }else if(arr[i]<0){
             negativeCount++;
         }else {
             zeroCount++;
         }
        }
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
    }
}
