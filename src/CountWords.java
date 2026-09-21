import java.util.Scanner;
public class CountWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s= sc.nextLine();
        int count = 0;
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i-1) == ' ')) {
                count++;
            }
        }
        System.out.print("words: " + count);
        sc.close();
    }
}
