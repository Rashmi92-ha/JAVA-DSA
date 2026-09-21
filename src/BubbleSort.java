public class BubbleSort {
    public static void main(String[] args){
        int[] arr = {2,9,4,3,2,3,8,7,5};
        boolean sorted = true;
        for(int i=0; i<arr.length-1; i++){
                sorted = true;
            for(int j=0; j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
        if(sorted){
            break;
        }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
