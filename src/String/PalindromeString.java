package String;

import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a String:");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                System.out.print("Not a Palindrome");
                sc.close();
                return;
            }
            left++;
            right--;
        }
        System.out.print("Palindrome");
        sc.close();
    }

}
