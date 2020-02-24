package learnings.interfaceconcepts.examples;

public class InorderTraversal {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right= null;
        }
    }

    // Recursive Solution
    public void inOrderTraversal(Node root) {
        if (root != null) {
            inOrderTraversal(root.left);
            //Visit the node by Printing the node data
            System.out.printf("%d ", root.data);
            inOrderTraversal(root.right);
        }
    }

    public static Node createBinaryTree() {

        Node rootNode = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node9 = new Node(9);

        rootNode.left = node2;
        rootNode.right = node3;

        node2.left = node4;
        node2.right = node5;

        node5.right = node9;
        node3.right = node6;


        return rootNode;
    }

    public static void main(String[] args) {
        InorderTraversal bi = new InorderTraversal();
        // Creating a binary tree

        System.out.println("Using Recursive solution:");

        bi.inOrderTraversal(createBinaryTree());

    }


}
