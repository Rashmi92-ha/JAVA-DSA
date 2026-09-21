public class ReverseArray {
    public static void main(String[] args){
        int[] arr = {12, 34,89, 34,32,90};
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
