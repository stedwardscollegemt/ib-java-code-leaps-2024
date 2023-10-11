package lesson15;

public class BinaryTreeNode {
    // Data
    private boolean isRoot;

    char key; // In here we are storing 'P', 'C'

    BinaryTreeNode left;

    BinaryTreeNode right;
    
    // Constructor
    public BinaryTreeNode(boolean isRoot, char key) {
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

}