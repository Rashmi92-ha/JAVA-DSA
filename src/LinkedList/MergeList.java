package LinkedList;

public class MergeList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node merge(Node head1, Node head2){
        Node dummy = new Node(0);
        Node current = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                current.next = head1;
                head1 = head1.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 != null){
            current.next = head1;
        }else{
            current.next = head2;
        }
        return  dummy.next;
    }
    public static void main(String[] args){
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(30);

        Node head2 = new Node(40);
        head2.next = new Node(50);
        head2.next.next = new Node(60);

        Node mergedHead = merge(head1, head2);
        Node current = mergedHead;
        while(current!=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
