package javaCollections.linkedListImplementation;

public class MyLinkedList {
    private Node firstNode;

    public void add(int element){
        if(firstNode == null){
            firstNode = new Node(element, null);
        }
        else{
            Node current = firstNode;
            while(current.next != null){
                current = current. next;
            }
            current.next = new Node(element, null);
        }
    }
    public int get(int index){
        Node current = firstNode;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.next;
        }
        else{
            Node current = firstNode;
            for(int i = 1; i < index; i++){
                current = current.next;
            }
            current.next = current.next.next;
        }
    }
    public void clear(){
        firstNode = null;
    }
    public int size(){
        Node current = firstNode;
        int index = 0;
        while(current != null){
            current = current.next;
            index ++;
        }
        return index;
    }
}
