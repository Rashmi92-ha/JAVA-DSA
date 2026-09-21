package String;

public class BruteForcePattern {
    public static void main (String[] args){
        String text = "hello world";
        String pattern = "world";
        for(int i=0; i<= text.length()-pattern.length(); i++){
            boolean found = true;
            for(int j=0; j< pattern.length(); j++){
                if(text.charAt(i+j) != pattern.charAt(j)){
                    found = false;
                    break;
                }
            }
            if(found){
                System.out.println("Pattern found at index: " + i);
                return;
            }
        }
        System.out.println("Pattern not found");
    }
}
