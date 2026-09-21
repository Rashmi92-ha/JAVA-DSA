package Recursion;
import java.util.*;
public class BackTracking {
    static void generateSubSets(int[] arr, int index, List<Integer> current){
        if (index == arr.length){
            System.out.println(current);
            return;
        }
        current.add(arr[index]);
        generateSubSets(arr,index+1, current);

        current.remove(current.size() -1);
        generateSubSets(arr,index+1, current);
    }
    public static void main(String[] args){
        int[] arr = {1,2};
        generateSubSets(arr, 0, new ArrayList<>());
    }
}
