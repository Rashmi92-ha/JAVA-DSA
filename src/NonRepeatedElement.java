import java.util.Scanner;
public class NonRepeatedElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            int count = 0;
            for(int k=0; k<s.length();k++){
                if(ch == s.charAt(k)){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
