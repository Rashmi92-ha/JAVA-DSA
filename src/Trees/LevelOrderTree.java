package Trees;
import java.util.Queue;
import java.util.LinkedList;
public class LevelOrderTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right =null;
        }
    }

    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.poll();
            System.out.println(current.data);

            if(current.left != null) {
                queue.add(current.left);
            }
            if(current.right !=null){
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args){
        Node queue = new Node(10);
        queue.left = new Node(5);
        queue.right = new Node(20);

        queue.left.left = new Node(3);
        queue.left.right = new Node(7);
        queue.right.left = new Node(15);

        System.out.println("Inorder: ");
        levelOrder(queue);
    }
}
