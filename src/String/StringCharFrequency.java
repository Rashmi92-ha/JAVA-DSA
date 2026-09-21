package String;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class StringCharFrequency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        Map<Character, Integer> freq = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char chr = s.charAt(i);
            freq.put(chr, freq.getOrDefault(chr,0)+1);
        }
        freq.forEach((key, value) ->
                System.out.println(key + "->" + value));
        }
    }

