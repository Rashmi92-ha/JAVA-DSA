package Problems;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class WordFrequencyMap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int n = sc.nextInt();
        Map<String,Integer> freq = new LinkedHashMap<>();
        for(int i=0; i<n ; i++){
            String word = sc.next();
            freq.put(word,freq.getOrDefault(word, 0) + 1);
        }
        for(String word: freq.keySet()){
            System.out.println(word + " " + freq.get(word));
        }
    }
}
