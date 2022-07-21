# Recursion

What if you wanted to traverse a tree in order? Since a tree has both left and right nodes, doing simple for loop would not work. This is why you need to use recursion

### Two problem solving techniques

#### Iteration (Iterative)

A programming technique in which you describe action to be repeated using a loop (for or while loop)

#### Recursion (Recursive)

A programming technique in which you describe actions to be repeated using a method that calls itself.

### Recursion Example

```java
public class Main{
    // Print numbers 1 to 10 using a for loop
    public static void iterativePrint(){
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
    }
    // Print numbers 1 to 10 using recursion
    public static void recursivePrint(){
        rescursizePrintHelper(1);
    }
    private static void recursivePrintHelper(int n ){
        // Base case, where the program ends
        if(n > 10){
            return;
        }
        // Do the task
        System.out.println(n);
        // Recursive case, where the program calls itself
    }
}
```

### Recursion with reutnr values

```java
public class Main{
    public int peopleInLint(){
        if(isFirst()){
            return 1;
        }
        return peopleInLin() + 1;
    }
}
```

### Recursion with more than one recursive call

```java
public class Main{
    public int fib(int n ){
        if(n <= 1){
            return n;   
        }
        return fib(n - 1) + fib(n - 2);
    }
}
```

