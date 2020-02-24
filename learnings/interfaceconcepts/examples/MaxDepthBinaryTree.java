package learnings.interfaceconcepts.examples;

public class MaxDepthBinaryTree {

    //https://leetcode.com/problems/maximum-depth-of-binary-tree/
    //https://www.youtube.com/watch?v=jN7xVW2Qtbs

    //Find the maximum depth of the tree. Use divide and conquer technique


    MaxDepthBinaryTree root;
    MaxDepthBinaryTree left;
    MaxDepthBinaryTree right;
    int data;


    MaxDepthBinaryTree(int data) {

        this.data = data;

    }


    private static int findMaxDepth(MaxDepthBinaryTree root) {

        if (root == null)
            return 0;

        //recursive

        int maxLeftDepth = findMaxDepth(root.left);
        int maxRightDepth = findMaxDepth(root.right);

        int maxDepth = Math.max(maxLeftDepth, maxRightDepth) + 1;

        return maxDepth;
    }


    public static void main(String[] args) {


        //if you try the build the tree here you can see the out ut for sure.


    }


}
