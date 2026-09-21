import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, 25, 8, 19, 30};
        System.out.println("Enter Target number: ");
        int target = sc.nextInt();
        boolean found = false;
        for(int i=0; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Number not found");
        }
        sc.close();
    }
}
