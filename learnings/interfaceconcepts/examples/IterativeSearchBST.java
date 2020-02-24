package learnings.interfaceconcepts.examples;

public class IterativeSearchBST {
    //https://www.geeksforgeeks.org/iterative-searching-binary-search-tree/


    //innerclass
    static class Node {
        int data;
        Node left, right;
    }


    // Function to check the given key exist or not
    static boolean iterativeSearch(Node root, int key) {


        while (root != null) {

            if (key > root.data) {
                root = root.right;
            } else if (key < root.data) {
                root = root.left;
            } else
                return true; // You have found the key key = root.data


        }

        return false;

    }

    // A utility function to create a new BST Node
    static Node newNode(int item) {
        Node temp = new Node();
        temp.data = item;
        temp.left = temp.right = null;
        return temp;
    }


    /* A utility function to insert a new Node with
    given key in BST */
    static Node insert(Node Node, int data) {
    /* If the tree is empty, return a new Node */
        if (Node == null) return newNode(data);

    /* Otherwise, recur down the tree */
        if (data < Node.data)
            Node.left = insert(Node.left, data);
        else if (data > Node.data)
            Node.right = insert(Node.right, data);

    /* return the (unchanged) Node pointer */
        return Node;
    }


    // Driver code
    public static void main(String args[]) {
    /* Let us create following BST
            50
            / \
        30 70
        / \ / \
    20 40 60 80 */
        Node root = null;
        root = insert(root, 50);
        insert(root, 30);
        insert(root, 20);
        insert(root, 40);
        insert(root, 70);
        insert(root, 60);
        insert(root, 80);
        if (iterativeSearch(root, 20))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

}


//construct a binary tree
//search a node in binary tree - iterative
//Inserting a new node in the tree