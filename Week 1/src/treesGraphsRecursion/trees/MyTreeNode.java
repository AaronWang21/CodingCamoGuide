package treesGraphsRecursion.trees;
import javaCollections.stacksAndQueues.MyQueue;
public class MyTreeNode {
    public int data;
    public MyTreeNode left;
    public MyTreeNode right;

    // Cunstructs a leaf node with given data
    public MyTreeNode(int data){
        this.data = data;
    }

    // Constructs a branch node with given data, left subtree,
    // right subtree
    public MyTreeNode(int data, MyTreeNode left, MyTreeNode right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}