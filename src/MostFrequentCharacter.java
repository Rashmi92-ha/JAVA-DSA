import java.util.Scanner;
public class MostFrequentCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        int max = 0;
        char maxChar =' ';

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            int count =0;
            for(int k=0;k<s.length();k++){
                if(ch == s.charAt(k)){
                    count ++;
                }
            }
            if(count> max){
                max = count;
                maxChar = ch;
            }
        }
        System.out.println(maxChar + " = " + max);
    }
}
