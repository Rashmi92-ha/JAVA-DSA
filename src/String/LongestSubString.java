package String;

import java.util.*;
public class LongestSubString {
    public static void main(String[] args){
        String s = "abcaaddbbc";
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxlength = 0;
        int start =0;
        int end = 0;

        while(right< s.length()){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int currentLength = right - left + 1;
            if(currentLength > maxlength){
                maxlength = currentLength;
                start = left;
                end = right;
            }
            right++;
        }
        System.out.println("Maxlength: " + maxlength);
        System.out.println("longest SubString: " + s.substring(start, end+1));
    }
}
