package LinkedList;

public class LinkedListMergingwithoutDuplicates {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node mergeLinkedListRemoveDuplicates(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node current = dummy;

        Integer lastAdded = null;
        while (head1 != null || head2 != null) {
            int value;
            if (head1 == null) {
                value = head2.data;
            } else if (head2 == null) {
                value = head1.data;
            } else {
                value = Math.min(head1.data, head2.data);
            }
            if (lastAdded == null || lastAdded != value) {
                current.next = new Node(value);
                current = current.next;
                lastAdded = value;
            }
            if(head1 != null && head1.data == value){
                head1 = head1.next;
            }
            if(head2 != null && head2.data == value){
                head2 = head2.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args){
        Node head1 = new Node(10);
        head1.next = new Node(20);
        head1.next.next = new Node(20);

        Node head2 = new Node(30);
        head2.next = new Node(40);
        head2.next.next = new Node(50);

        Node mergeList = mergeLinkedListRemoveDuplicates(head1,head2);
        Node current = mergeList;

        while(current !=null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
