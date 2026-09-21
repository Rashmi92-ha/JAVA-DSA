package String;

import java.util.Scanner;
public class CharachterFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean repatedElement = false;
        for(int i=0; i<s.length();i++){
            repatedElement = false;
            char ch = s.charAt(i);
            for(int k=0; k<i; k++){
                if(ch == s.charAt(k)){
                    repatedElement = true;
                    break;
                }
            }
            if(repatedElement){
                continue;
            }
            int count =0;
            for(int j=0; j<s.length();j++){
                if(ch == s.charAt(j)){
                    count++;
                }
            }
            System.out.println(ch + " = " + count);
        }
    }
}
