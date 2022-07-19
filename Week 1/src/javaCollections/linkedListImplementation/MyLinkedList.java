package javaCollections.linkedListImplementation;

import java.util.ArrayList;

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
    public boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public int sumOfPrime(){
        Node current = firstNode;
        int sum = 0;
        while(current != null){
            if(isPrime(current.data)){
                sum += current.data;
            }
            current = current.next;
        }
        return sum;
    }
    public void switchNode(){
        if(firstNode == null || firstNode.next == null){
           return;
        }
        Node previous = firstNode;
        Node current = firstNode.next;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        current.next = firstNode;
        firstNode = current;
    }
    public String toString(){
        StringBuilder sdfkljsdl = new StringBuilder();
        Node current = firstNode;
        while(current != null){
            sdfkljsdl.append(current.data).append(" ");
            current = current.next;
        }
        return sdfkljsdl.toString();
    }
}