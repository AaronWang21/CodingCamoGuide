package javaCollections.stacksAndQueues;

public class Queue {
    private Node firstNode;
    private Node lastNode;

    public void add(int value){
        if(lastNode == null){
            lastNode = new Node(value, null);
            firstNode = lastNode;
        }
        else{
            lastNode.next = new Node(value, null);
            lastNode = lastNode.next;
        }
    }
    public int peek (){
        return firstNode.data;
    }
    public int remove(){
        int temp = firstNode.data;
        firstNode = firstNode. next;
        if(firstNode == null){
            lastNode = null;
        }
        return temp;
    }
}
