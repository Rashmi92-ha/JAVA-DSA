public class LargestnumberInArray {
    public static void main(String[] args){
        int[] array = {34, 30, 3, 22, 2, 29};
        int largest = array[0];
        int smallest = array[0];
        for(int i=1 ; i< array.length; i++){
            if(array[i]>largest) {
                largest = array[i];
            }
            if(array[i] < smallest) {
                smallest = array[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}
