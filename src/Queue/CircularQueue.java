package Queue;

public class CircularQueue {
    int[] queue;
    int front =0;
    int rare = -1;
    int size = 0;
    CircularQueue(int capacity){
        queue = new int[capacity];
    }
    boolean enQueue(int value){
        if(size == queue.length){
            return false;
        }
        rare = (rare + 1) % queue.length;
        queue[rare] = value;
        size++;
        return true;
    }
    Integer dequeue(){
        if(size == 0){
            return null;
        }
        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return value;
    }
    Integer peek(){
        if(size == 0){
            return null;
        }
        return queue[front];
    }
   boolean isEmpty(){
        return rare == -1;
   }
   void display(){
        for(int i = 0; i<size; i++){
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }
   }
   public static void main(String[] args){
        CircularQueue queue1 = new CircularQueue(5);
        queue1.enQueue(10);
        queue1.enQueue(20);
        queue1.enQueue(30);
        queue1.enQueue(40);
        queue1.enQueue(50);
        queue1.display();
        System.out.println("Dequeued: " + queue1.dequeue());
        System.out.println("Dequeued: " + queue1.dequeue());
        queue1.enQueue(60);
        queue1.enQueue(70);
        queue1.display();
        System.out.println("peeked: " + queue1.peek());
   }
}
