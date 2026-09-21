package Array;

public class ArrayRotation {
    static void Reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k= k% arr.length;
        Reverse(arr, 0, k-1);
        Reverse(arr, k, arr.length-1);
        Reverse(arr,0, arr.length-1);
        System.out.print("After left Rotation: ");

        for(int num: arr ){
            System.out.print(num + " ");
        }
        System.out.println();
        Reverse(arr , 0, arr.length-1 - k - 1);
        Reverse(arr, arr.length-1 -k , arr.length-1-1);
        Reverse(arr , 0 , arr.length-1-1);
        System.out.print("After Right Rotation: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
