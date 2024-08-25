package tarlan.printer.com.helper;

/**
 * The TreeNode class is a basic building block used to represent nodes in a binary tree. Each TreeNode object contains three main components
 */
public class TreeNode {
    // An integer value representing the data stored in the node.
    int val;

    // A reference to the left child of the current node. If the left child does not exist, this will be null. 
    TreeNode left;

    // A reference to the right child of the current node. If the right child does not exist, this will be null.
    TreeNode right;

    // A constructor that initializes the node with a given integer value x. The left and right child references are initialized to null by default.
    TreeNode(int x) { val = x; }
}