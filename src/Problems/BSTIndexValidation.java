package Problems;

import java.util.Scanner;

public class BSTIndexValidation {
    static int[] values;
    static int[] left;
    static int[] right;
    static boolean isValid(int index, long min , long max){
        if(index == -1){
            return true;
        }
        int currentValue = values[index];
        if (currentValue <= min || currentValue >= max){
            return false;
        }
        return isValid(left[index] , min , currentValue) && isValid(right[index] , currentValue,max);
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        values = new int[num];
        left = new int[num];
        right = new int[num];
        for(int i=0; i<num;i++){
            values[i] = sc.nextInt();
            left[i] = sc.nextInt();
            right[i] = sc.nextInt();
        }
        boolean result = isValid(0, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println(result + " ");
    }
}
