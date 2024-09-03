package tarlan.printer.com.helper;

/**
 * The TreeNode class is a basic building block used to represent nodes in a binary tree.
 * Each TreeNode object contains three main components [val, left, right], plus extra companents [next]
 */
public class TreeNode {
    // An integer value representing the data stored in the node.
    public int val;

    // A reference to the left child of the current node. If the left child does not exist, this will be null. 
    public TreeNode left;

    // A reference to the right child of the current node. If the right child does not exist, this will be null.
    public TreeNode right;

    // A reference to the next node of the current node. If the right child does not exist, this will be null.
    public TreeNode next;

    // A constructor that initializes the node with a given integer value x. The left and right child references are initialized to null by default.
    public TreeNode(final int x) {
        this.val = x;
    }

    // A constructor that initializes the node with a given integer value x, left and right child references.
    public TreeNode(final int x, final TreeNode left, final TreeNode right) {
        this.val = x;
        this.left = left;
        this.right = right;
    }

    // A constructor that initializes the node with a given integer value x, left, right and next tree node references.
    public TreeNode(final int x, final TreeNode left, final TreeNode right, TreeNode next) {
        this.val = x;
        this.left = left;
        this.right = right;
        this.next = next;
    }
}