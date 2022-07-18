# Array Lists! Usage and Implementation

ArrayLists can be thought of like a normal list. You can add to an ArrayList, you can remove, replace, and do other operatiohs.

However, all of these are implemented underneath using expanding arrays

```java
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>(List.of("Hello", "World"));
        words.add("!");
        words.add(0, "Woohoo")
        words.set(1, "World");
        words.remove(0);
        System.out.println(words.get(0));
        System.out.println(words.indexOf("Hello"));
        words.forEach(System.out::println);
    }
} 
```

