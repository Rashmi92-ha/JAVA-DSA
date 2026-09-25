package Trees;

public class BSTSearchInsert {
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

    static Node delete(Node root, int value){
        if(root == null){
            return null;
        }
        if(value < root.data){
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right,value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            if(root.left == null){
                return root.right;
            }
            if(root.right == null){
                return root.left;
            }
            Node successor = finMin(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }
        return root;
    }
    static Node finMin(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
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

        root = delete(root, 7);
        System.out.println("The BST of the Deleted Node: ");
        BTS(root);
    }
}
