package Trees;

public class BinarySearchTreeInsertion {
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
    static Node insert(Node root, int value){
        if(root == null){
            return new Node(value);
        }
        if(value < root.data){
            root.left = insert(root.left , value);
        }else{
            root.right = insert(root.right,value);
        }
        return root;
    }

    static Boolean search(Node root, int value){
        if(root == null){
            return false;
        }
        if(root.data == value){
            return true;
        }
        if(value < root.data){
            return search(root.left, value);
        }else{
            return search(root.right,value);
        }
    }

    static void BTS(Node root){
        if(root == null){
            return;
        }
        BTS(root.left);
        System.out.println(root.data + " ");
        BTS(root.right);
    }
    public static void main(String[] args){
        Node root = null;
        int[] values = {10,5,3,20,7,15};
        for(int v: values){
            root = insert(root, v);
        }
        System.out.println("Binary Search tree: ");
        BTS(root);

        boolean rootSearch = search(root, 6);
        System.out.println("Is the value Present: " + rootSearch);

    }
}
