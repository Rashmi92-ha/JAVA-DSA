package String;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter S1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter S2: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.print("Not String.Anagram");
        } else {
            Map<Character, Integer> freq = new HashMap<>();
            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                freq.put(ch , freq.getOrDefault(ch, 0) + 1);
            }
            for(int i=0; i<s2.length(); i++){
                char ch = s2.charAt(i);
                if(!freq.containsKey(ch)){
                    System.out.println("Not Anagram");
                    return;
                }
                freq.put(ch,freq.get(ch) - 1);
            }
            for(int count: freq.values()){
                if(count != 0){
                    System.out.println("Not Anagram");
                    return;
                }
            }
            System.out.println("Anagram");
        }
    }
}
