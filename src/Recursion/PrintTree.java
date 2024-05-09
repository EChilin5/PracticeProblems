package Recursion;

class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = null;
        right =null;
    }
}

public class PrintTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new  Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(5);
        root.right.right = new Node(8);
        root.right.left.left = new Node(6);
        root.right.left.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        // Print leaf nodes of the given tree
        printLeafNodes(root);
    }

    private static void printLeafNodes(Node root) {
        if(root == null){
            return;
        }
        // print the root of the tree
        System.out.println(root.data);
        if(root.left != null){
            printLeafNodes(root.left);
        }
        if(root.right != null){
            printLeafNodes(root.right);
        }

    }
}
