package lesson15;

import lesson02.BuildingBlocks;

public class BinaryTreeNode {
    
    // Data
    private boolean isRoot;

    private boolean isVisited;

    private String key; // In here we are storing "P", "C"

    private BinaryTreeNode left;

    private BinaryTreeNode right;

    // light ui dependency
    private static StringBuilder printBuffer = new StringBuilder();
    
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

    public boolean isParent() {
        if (this.left != null || this.right != null) {
            return true;
        }
        return false;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public BinaryTreeNode getLeft() {
        return this.left;
    }

    public BinaryTreeNode getRight() {
        return this.right;
    }

    public void visit() { 
        BinaryTreeNode.printBuffer.append(this.key + ", ");
        this.isVisited = true;
    }

    // Allow for static access
    public static StringBuilder getPrintBuffer() {
        return BinaryTreeNode.printBuffer;
    }

    /**
     * Tree Node Traversals
     */
    public void printInOrder()
    {
        if (this.isVisited) return;

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printInOrder();
        }
        
        // visit the current node
        this.visit();
        
        /* Recur on the right */
        if (this.right != null) {
            this.right.printInOrder();
        }
    }

    public void printPostOrder()
    {
        if (this.isVisited) return;

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printPostOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPostOrder();
        }
        
        // visit the current node
        this.visit();

        return;
    }

    public void printPreOrder()
    {
        if (!this.isVisited) {
            // visit the current node
            this.visit();
        }

        /* Recur on the left as much as you can */
        if (this.left != null) {
            this.left.printPreOrder();
        }

        /* Recur on the right */
        if (this.right != null) {
            this.right.printPreOrder();
        }

        return;
    }
}