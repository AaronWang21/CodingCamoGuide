package javaCollections.stacksAndQueues;
import java.util.Queue;
public class Main {
    public static void main(String[] args) {
        MyQueue SecondQueue = new MyQueue();
        SecondQueue.add(5);
        SecondQueue.add(6);
        SecondQueue.add(2);
        SecondQueue.add(4);
        System.out.println(SecondQueue.isEmpty());
        System.out.println(SecondQueue.remove());
        SecondQueue.clear();
        System.out.println(SecondQueue.isEmpty());
    }
    public static void Method (MyQueue mainQueue){
        MyQueue newQueue = new MyQueue();
        while(!mainQueue.isEmpty()){
            System.out.println(mainQueue.peek());
            newQueue.add(mainQueue.remove());
        }
        while (!newQueue.isEmpty()) {
            mainQueue.add(newQueue.remove());
        }
    }
}