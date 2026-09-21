import java.util.Scanner;
public class PattrenMatching {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Text: ");
        String text = sc.nextLine();
        System.out.print("Enter the Pattern: ");
        String pattern = sc.nextLine();
        boolean found = false;
        for(int i=0; i<= text.length()-pattern.length(); i++){
            boolean match = true;
            for(int j=0; j<pattern.length();j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match){
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Pattern found");
        }else{
            System.out.println("Pattern not found");
        }
        sc.close();
    }
}
