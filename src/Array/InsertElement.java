package Array;

public class InsertElement {
    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 4;
        arr[3] = 6;
        arr[4] = 7;

        int n = 5;
        int pos = 2;
        int value = 25;

        for(int i=n; i > pos; i--){
            arr[i] = arr[i-1];
        }
        arr[pos] = value;
        n++;

        for(int i=0; i<n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
