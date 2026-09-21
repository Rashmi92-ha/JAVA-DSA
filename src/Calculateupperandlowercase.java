import java.util.Scanner;
public class Calculateupperandlowercase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s= sc.nextLine();
        int upper = 0;
        int lower = 0;
        for(int i=0; i< s.length();i++){
            char ch= s.charAt(i);
            if( Character.isUpperCase(ch)){
                upper++;
            } else if (ch >= 'a' && ch <= 'z') {
                lower++;
            }
        }
        System.out.print("UpperCase = " + upper);
        System.out.print(" Lower = " + lower);
    }
}
