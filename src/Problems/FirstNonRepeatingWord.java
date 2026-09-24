package Problems;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class FirstNonRepeatingWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int  num = sc.nextInt();
        String[] words = new String[num];
        Map<String,Integer> freq = new HashMap<>();
        for(int i=0; i<num;i++){
            String word = sc.next();
            words[i] = word;
            freq.put(word, freq.getOrDefault(word,0) + 1);
        }
        for(String word: words){
            if(freq.get(word) == 1){
                System.out.println(word);
                break;
            }
        }
    }
}
