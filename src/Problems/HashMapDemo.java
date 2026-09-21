package Problems;

import java.util.Map;
import java.util.HashMap;

// Given an array and a target, find two numbers whose sum equals the target
public class HashMapDemo {
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (map.containsKey(comp)) {
                return new int[]{
                        map.get(comp), i};
            }
                map.put(arr[i], i);
            }
            return new int[]{};
    }
    public static void main(String[] args){
        int[] arr = {1,3,5,6,7,9};
        int target = 7;
        int[] result = twoSum(arr,target);
        System.out.println("Index 1:" + result[0]);
        System.out.println("Index 2:" + result[1]);
    }

}
