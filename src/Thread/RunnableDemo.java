package Thread;

class Task implements Runnable{
    @Override
    public void run(){
        System.out.println("Task is running");
    }
}
public class RunnableDemo {
    public static void main(String[] args){
        Task task = new Task();
        Thread t= new Thread(task);
        t.start();
        System.out.println("Main Thread is Running");
    }
}
