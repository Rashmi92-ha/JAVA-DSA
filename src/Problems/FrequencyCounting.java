package Problems;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCounting {
    public static void main(String[] args){
        int[] numbers = {1, 2, 2, 3, 1, 2};
        Map<Integer,Integer> frequency = new HashMap<>();
        for(int num:numbers){
            frequency.put(num ,frequency.getOrDefault(num, 0) +1 );
        }
        System.out.println(frequency);
    }
}
