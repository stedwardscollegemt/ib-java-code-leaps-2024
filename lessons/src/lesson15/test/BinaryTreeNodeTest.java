package lesson15.test;

import lesson15.BinaryTreeNode;

public class BinaryTreeNodeTest {

    private BinaryTreeNode mockRoot = null;
    private BinaryTreeNode mockLeft = null;
    private BinaryTreeNode mockRight = null;
    
    public void run() {
        testIsRootGivesTrue();
    }

    public void setup() {
        mockRoot = new BinaryTreeNode(true, "Root");
        mockLeft = new BinaryTreeNode(false, "L");
        mockRight = new BinaryTreeNode(false, "R");
        mockRoot.setLeft(mockLeft); 
        mockRight.setRight(mockRight);
    }

    public void teardown() {

    }

    public void testIsRootGivesTrue() {
        setup();
        boolean expected = true;
        boolean actual = mockRoot.isRoot();
        if (expected == actual) {
            System.out.print("P ");
        } else {
            System.out.print("F ");
        }
        teardown();
    }

    public void testIsRootGivesFalse() {
        setup();
        teardown();
    }

    public void testPrintInOrder() {
        setup();
        String expected = "";
        String actual = mockRoot.isRoot();
        if (expected == actual) {
            System.out.print("P ");
        } else {
            System.out.print("F ");
        }
        teardown();
    }    
}
