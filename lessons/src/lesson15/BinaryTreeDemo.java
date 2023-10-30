package lesson15;

public class BinaryTreeDemo {
    
    public static void main(String[] args) {

        // The Binary Tree for the CS Classroom
        BinaryTreeNode csTeacher = new BinaryTreeNode(true, "EC");
        csTeacher.setLeft(new BinaryTreeNode(false, "JB"));
        csTeacher.setRight(new BinaryTreeNode(false, "BSZ"));
        csTeacher.getLeft().setLeft(new BinaryTreeNode(false, "FT"));

        System.out.println(csTeacher.isLeafNode());

        csTeacher.printPreOrder();
    }
}
