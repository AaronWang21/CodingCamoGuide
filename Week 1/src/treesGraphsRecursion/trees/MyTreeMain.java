package treesGraphsRecursion.trees;
public class MyTreeMain {
    public static void main(String[] args) {
        MyTreeNode root = new MyTreeNode(50);
        root.left = new MyTreeNode(10);
        root.right = new MyTreeNode(13);
        root.left.right = new MyTreeNode(2);
        root.left.left = new MyTreeNode(16);
        root.left.left.left = new MyTreeNode(5);
        root.right.left = new MyTreeNode(3);
        root.right.right = new MyTreeNode(10);
        root.right.right.left = new MyTreeNode(9);
    }
}