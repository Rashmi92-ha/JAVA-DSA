import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
        int low = 0;
        int high = arr.length-1;
        boolean found = false;
        while(low <= high) {
            int mid = (low + (high-1)) / 2;
            if(arr[mid] == target){
                System.out.println("Found at index " + mid);
                found = true;
                break;
            }
            else if(target> arr[mid]){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }
        if(!found){
            System.out.println("Element not found");

        }    }
}
