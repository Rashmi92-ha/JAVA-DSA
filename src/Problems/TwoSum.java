package Problems;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers , int target){
        Map<Integer,Integer> map =  new HashMap<>();
        for(int i=0 ; i<numbers.length; i++){
            int complement = target - numbers[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(numbers[i], i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int[] numbers = {2, 7, 11, 15};
        int target = 18;
        int result[] = twoSum(numbers,target);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(numbers[result[0]] + " " + numbers[result[1]]);
    }
}
