package String;

import java.util.Map;
import java.util.HashMap;
public class FrstNonReapitingcharacter {
    public static void main(String[] args){
        String str = "Lakshmamma";
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0 ) + 1);
        }
        for(int i=0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(map.get(ch) == 1){
                System.out.println("First non Repeating character: " + ch);
                break;
            }
        }
    }
}
