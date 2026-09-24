package Problems;
import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;
public class FirstNonRepeatingCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        Map<Character, Integer> freq = new LinkedHashMap<>();
        for(char ch: text.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0) + 1);
        }
        Character result = null;
        for(char ch: text.toCharArray()){
            if(freq.get(ch) == 1){
                result = ch;
                break;
            }
        }

        System.out.println(result!= 0 ? result : "Not found");
    }
}
