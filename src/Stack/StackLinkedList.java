package Stack;

public class StackLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
       Node top = null;

        void push(int data){
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }
        Integer pop(){
            if(top == null){
                return null;
            }
            int value = top.data;
            top = top.next;
            return value;
        }
        Integer peek(){
            if(top == null){
                return null;
            }
            return top.data;
        }
        boolean isEmpty(){
            return top == null;
        }
        void display(){
            Node current = top;
            while(current != null){
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public static void main(String[] args){
            StackLinkedList stack = new StackLinkedList();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.display();
            stack.pop();
            stack.peek();
            stack.isEmpty();
            stack.display();
        }
    }
