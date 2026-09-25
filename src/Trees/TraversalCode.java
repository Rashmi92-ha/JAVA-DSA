package Trees;

public class TraversalCode {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
   static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    public static void main(String[] args){
        Node root = new Node(10);
        root.left = new Node(5);
        root.right= new Node(20);

        root.left.left = new Node(3);
        root.right.right = new Node(7);

        System.out.println("Inorder: ");
        inorder(root);
        System.out.println("Preorder: ");
        preOrder(root);
        System.out.println("Postorder: ");
        postOrder(root);
    }
}
