package Array;

public class DeleteElement {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;

        int n=5;
        int pos = 3;

        for(int i=pos; i<n-1 ; i++){
            arr[i] = arr[i+1];
        }
        n--;

        for(int i=0; i<n ; i++){
            System.out.println(arr[i]);
        }
    }
}
