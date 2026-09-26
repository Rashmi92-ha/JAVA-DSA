package Problems;
import java.util.Scanner;
public class CoconutTree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long[] height = new long[num];
        for(int i=0 ; i<num ; i++){
            height[i] = sc.nextLong();
        }
        long minHeight = Long.MAX_VALUE;
        for(long h : height){
            if(h<minHeight){
                minHeight = h;
            }
        }
        int count = 0;
        for(long h : height){
            if(h==minHeight){
                count++;
            }
        }
        System.out.println(count);
    }
}
