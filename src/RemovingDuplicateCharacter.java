import java.util.Scanner;
public class RemovingDuplicateCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        boolean repatedElments = false;
        for(int i=0; i<s.length(); i++){
            repatedElments = false;
            char ch = s.charAt(i);
            for(int k=0;k<i;k++){
                if(ch == s.charAt(k)){
                    repatedElments= true;
                    break;
                }
            }
            if(repatedElments){
                continue;
            }
            System.out.println(ch);
        }
    }
}
