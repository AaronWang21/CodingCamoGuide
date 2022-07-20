package javaCollections.setsAndMaps;
import java.lang.reflect.Array;
import java.util.*;
public class HashSetChallenge {
    public static void main(String[] args) {
        ArrayList<Integer> NumbersArrayList = new ArrayList<>(List.of(1,2,3,3,4,5,3,4));
        printNumbersWithTreeSet(NumbersArrayList);
        printOccurrence(NumbersArrayList);
        printNumber(NumbersArrayList);
        printOccurrenceWithTreeSet(NumbersArrayList);
    }
    public static void printNumber(ArrayList<Integer> numbersOfNumbers){
        Set<Integer> numbers = new HashSet<>(numbersOfNumbers);
        for(int item : numbers) {
            System.out.println(item);
        }
    }
    public static void printOccurrence(ArrayList<Integer> Numbers){
        Map<Integer, Integer> Counter  = new HashMap<>();
        for(int item : Numbers){
            if(Counter.containsKey(item)){
                Counter.put(item, Counter.get(item) + 1);
            }
            else{
                Counter.put(item, 1);
            }
        }
        System.out.println(Counter);
    }
    public static void printNumbersWithTreeSet(ArrayList<Integer> numbersOfNumbersOfNumbers){
        Set<Integer> numbers = new TreeSet<>(numbersOfNumbersOfNumbers);
        for(int item : numbers){
            System.out.println(item);
        }
    }
    public static void printOccurrenceWithTreeSet(ArrayList<Integer> Numbers){
        Map<Integer, Integer> Counter  = new TreeMap<>();
        for(int item : Numbers){
            if(Counter.containsKey(item)){
                Counter.put(item, Counter.get(item) + 1);
            }
            else{
                Counter.put(item, 1);
            }
        }
        System.out.println(Counter);
    }
}