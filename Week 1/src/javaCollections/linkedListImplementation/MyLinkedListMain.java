package javaCollections.linkedListImplementation;
public class MyLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.println(list.isPrime(4));
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list.sumOfPrime());
        list.switchNode();
        System.out.println(list);
    }
}
