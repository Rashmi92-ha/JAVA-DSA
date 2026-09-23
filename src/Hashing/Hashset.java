package Hashing;

import java.util.HashSet;

public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println(numbers);
        System.out.println(numbers.contains(20));
        numbers.remove(20);
        System.out.println(numbers);
    }
}
