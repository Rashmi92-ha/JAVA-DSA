package LinkedList;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList{
        Node head;

        void  add(int data){     // we add the node at end also
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            Node currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        void display(){
            Node current = head;
            while(current != null){
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
        void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
        void addMidle(int data, int target){
            Node newNode = new Node(data);
            if(head == null){
                return;
            }
            Node current = head;
            while (current!=null && current.data!= target){
                current = current.next;
            }
            if(current == null){
                System.out.println("Target not found");
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        void deleteFirst(){
            if(head == null){
                System.out.println("List not found");
                return;
            }
            head = head.next;
        }
        void deleteMiddle(int data){
            if(head == null){
                return;
            }
            Node current = head;
            while(current.next != null && current.next.data != data){
                current = current.next;
            }
            if(current.next!= null){
                current.next = current.next.next;
            }
        }
        void deleteEnd(){
            if(head == null){
                return;
            }
            if(head.next == null){
                return;
            }
            Node current = head;
            while(current.next.next !=null){
                current = current.next;
            }
            current.next = null;
        }
    }

    public static void main(String[] args){
        SinglyLinkedList obj = new SinglyLinkedList();
        LinkedList list = obj.new LinkedList();
        list.add(10);
        list.add(20);
        list.add(40);
        list.addFirst(5);
        list.addMidle(30,20);
        list.deleteFirst();
        list.deleteMiddle(30);
        list.deleteEnd();
        list.display();
    }
}
