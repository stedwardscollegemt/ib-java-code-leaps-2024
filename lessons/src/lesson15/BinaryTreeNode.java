package lesson15;

public class BinaryTreeNode {
    
    // Data
    private boolean isRoot;

    // TODO: Create a private attribute for isVisited

    private String key; // In here we are storing "P", "C"

    private BinaryTreeNode left;

    private BinaryTreeNode right;
    
    // Constructor
    public BinaryTreeNode(boolean isRoot, String key) {
        this.isRoot = isRoot;
        this.key = key;
    }

    // Methods
    public boolean isLeafNode() {
        if (this.left == null && this.right == null) return true;
        return false;
    }

    public boolean isRoot() {
        return this.isRoot;
    }

    // TODO: isParent

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    // TODO: setRight

    // TODO: getLeft

    // TODO: getRight

    // TODO: visit - print out the key by default and set is visited to true

    /**
     * Tree Node Traversals
     */
    public void printInorder()
    {
        // TODO: if this node is visited already, do nothing (return)

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printInorder();
        }
        
        /* TODO: Print */
        // call visit
        
        /* Recur on the right */
        if (this.right != null) {
            this.right.printInorder();
        }
    }

    // TODO: postOrder

    // TODO: preOrder
}