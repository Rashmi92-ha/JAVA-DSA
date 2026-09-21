package Thread;

class Mythread extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(300);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Thread is running");
    }
}
public class Multithreading {
    public static void main(String[] args){
        Mythread t = new Mythread();
        t.start();

        System.out.println("Main Thread is running");
    }
}
