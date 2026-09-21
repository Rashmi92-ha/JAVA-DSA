import java.util.Scanner;
public class FirstRepeatedCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean found = false;
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int k=0; k<i;k++){
                if(ch == s.charAt(k)){
                    System.out.println(ch);
                    found = true;
                    break;
                }
            }
            if(found){
                break;
            }
        }
    }
}
