package learnings.interfaceconcepts.examples;

import java.util.Stack;

public class Node {

    int data;
    Node left;
    Node right;
    Node root;


    Node(int data) {

        this.data = data;
        left = null;
        right = null;

    }

}


class BinaryTree {


    //Construct a Binary Search tree and get the root
    //https://www.geeksforgeeks.org/construct-bst-from-given-preorder-traversal-set-2/

    public Node constructBonaryTree(int[] preOrder, int arrayLength) {

        Stack<Node> stack = new Stack<>();
        Node temp = null;

        Node root = new Node(preOrder[0]);

        stack.push(root);

        for (int i = 1; i < preOrder.length - 1; i++) {

            //Forming the Right node

            if (!stack.isEmpty() && stack.peek().data < preOrder[i]) {
                temp = stack.pop(); // the root value
                if (temp != null) {
                    temp.right = new Node(preOrder[i]);
                    stack.push(temp.right);
                }
            } else {


                temp = stack.pop();  // the root value
                temp.left = new Node(preOrder[i]);
                stack.push(temp.left);

            }


        }
        return root;
    }

    public void printInOrder(Node root) {
        //Assume there is a binary tree constructed and you are printing inorder

        if (root == null) return; //if there is no tree pls return

        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);

        }


    }


    public static void main(String[] args) {


        int[] preOrder = {10, 5, 1, 7, 40, 50};
        int preOrderLength = preOrder.length;

        BinaryTree Bi = new BinaryTree();
        Node root = Bi.constructBonaryTree(preOrder, preOrderLength);
        // System.out.println(root.data);

        Bi.printInOrder(root);


    }


}