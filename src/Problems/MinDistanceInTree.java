package Problems;
import java.util.Scanner;
public class MinDistanceInTree {
    static class Node{
        char data;
        Node left;
        Node right;
        Node(char data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node buildTree(String inOrder, String postOrder){
        if(postOrder.length() == 0 || inOrder.length() == 0){
            return null;
        }
        char rootValue = postOrder.charAt(postOrder.length() - 1);
        int rootIndex = inOrder.indexOf(rootValue);

        Node root = new Node(rootValue);
        String leftOrder = inOrder.substring(0,rootIndex);
        String rightOrder = inOrder.substring(rootIndex + 1);
        String leftPostOrder = postOrder.substring(0,rootIndex);
        String rightPostOrder = postOrder.substring(rootIndex, postOrder.length() - 1);

        root.left = buildTree(leftOrder, leftPostOrder);
        root.right = buildTree(rightOrder,rightPostOrder);

        return root;
    }
    static Node lca(Node root , char a, char b){
        if(root == null){
            return null;
        }
        if(root.data== a || root.data == b ){
            return root;
        }
        Node left = lca(root.left,a,b );
        Node right = lca(root.right, a, b);
        if(left != null && right !=null){
            return root;
        }
        return left!=null ? left : right;
    }

    static int distance(Node root, char target){
        if(root == null){
            return -1;
        }
        if(root.data == target){
            return 0;
        }

        int leftDistance = distance(root.left, target);
        if(leftDistance != -1){
            return leftDistance + 1;
        }
        int rightDistance = distance(root.right,target);
        if(rightDistance != -1){
            return rightDistance + 1;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inOrder = sc.nextLine();
        String postOrder = sc.nextLine();

        char city1 = sc.next().charAt(0);
        char city2 = sc.next().charAt(0);

        Node root = buildTree(inOrder,postOrder);
        Node lcaNode = lca(root,city1,city2);

        int distance1 = distance(lcaNode, city1);
        int distance2 = distance(lcaNode, city2);

        System.out.println(distance1 + distance2);
    }
}
