package Queue;

public class DequeDoubllyLinkedList {
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    Node front = null;
    Node rear = null;

    void addFirst(int data){
        Node newNode = new Node(data);
        if(front == null){
            rear = front = newNode;
        }
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }
    void addLast(int data){
        Node newNode = new Node(data);
        if(front == null){
            rear = front = newNode;
            return;
        }
        rear.next = newNode;
        newNode.prev = rear;
        rear = newNode;
    }

    Integer removefirst(){
        if(front == null){
            return null;
        }
        int value = front.data;
        if(front == rear){
            front = rear = null;
            return value;
        }
        front = front.next;
        front.prev = null;
        return value;
    }
    Integer removeLast(){
        if(front == null){
            return  null;
        }
        int value = rear.data;
        if(front==rear){
            rear= front=null;
            return value;
        }
        rear = rear.prev;
        rear.next = null;
        return value;
    }
    Integer peekFirst(){
        if(front == null){
            return null;
        }
        return front.data;
    }
    Integer peekLast(){
        if(rear == null){
            return null;
        }
        return rear.data;
    }
    void display(){
        Node current = front;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        DequeDoubllyLinkedList deque = new DequeDoubllyLinkedList();
        deque.addFirst(5);
        deque.addFirst(6);
        deque.addLast(7);
        deque.addLast(8);
        deque.addLast(3);
        deque.addFirst(2);
        deque.display();
        System.out.println("Removed First: " + deque.removefirst());
        System.out.println("Removed Last: " + deque.removeLast());
        System.out.println("Peeked First: " + deque.peekFirst());
        System.out.println("Peeked Second: " + deque.peekLast());
        deque.display();
    }
}
