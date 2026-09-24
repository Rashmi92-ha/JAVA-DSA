package Problems;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] args){
        HashSet<Integer> seen = new HashSet<>();
        int[] numbers = {1, 2, 3, 2, 4, 1, 5};

        for(int num: numbers){
            if(seen.contains(num)){
                System.out.println("Duplicate : " + num);
            }else{
                seen.add(num);
            }
        }
    }
}
