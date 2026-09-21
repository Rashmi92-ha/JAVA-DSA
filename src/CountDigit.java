import java.util.Scanner;
public class CountDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int alpha = 0;
        int digit = 0;
        int space = 0;
        int special = 0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){
                alpha++;
            } else if (ch >='0' && ch<='9' ) {
                digit++;
            } else if (ch == ' ') {
                space++;
            } else {
                special++;
            }
        }
        System.out.println("alphabet= " + alpha);
        System.out.println("Number: " + digit);
        System.out.println("Space: " + space);
        System.out.println("Special Character: " + special);
        sc.close();
    }
}
