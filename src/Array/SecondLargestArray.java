Package Array;
public class SecondLargestArray {
    public static void main(String[] args){
        int[] arr = {15, 8, 25, 30,  18, 30};
        int largest = 0;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=1; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest)
                secondLargest = arr[i];
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}

void main() {
}


