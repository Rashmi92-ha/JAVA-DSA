package Array;

import java.util.Map;
import java.util.HashMap;

public class FrequencyCounting {
    public static void main(String[] args){
        int[] arr = {3,3,3,1,1,2,2,4,5};
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num , 0) +1);
        }
        freq.forEach((key,value) ->
                System.out.println(key + " -> " + value ));


    }
}
