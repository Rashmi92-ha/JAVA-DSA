package Queue;

public class LinkedListQueue {
    class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    void enQueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }
    Integer dequeue(){
        if(front == null){
            return null;
        }
        int value = front.data;
        front = front.next;

        if(front == null){
            rear = null;
        }
        return value;
    }
    Integer peek(){
        if(front == null){
            return null;
        }
        return front.data;
    }
    boolean isEmpty(){
        return front == null;
    }

    void display(){
        Node current = front;
        while (current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        LinkedListQueue queue = new LinkedListQueue();
        queue.enQueue(10);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.display();
        System.out.println("Dequeued: " + queue.dequeue() );
        System.out.println("Peeked: " + queue.peek() );
        queue.display();
    }
}
