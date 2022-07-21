# Stacks

*A tree in CS has a root node with left and right children.*

What if you wanted to visit every node in a tree? You would want ea data structure that easily lets you view the last item that you visited. This is where stacks come in.

### Definition

An ordered collection that allows adding and removing the "top" element, providing Last-In, First-Out (LIFO) access.

### Example

Say for example, you had a stack, and you put the number 1, 2, 3, 4, 5.
When you start removing the numbers, it would be 5, 4, 3, 2, 1.

### Java Example

```java
public class Main{
    public static void main(String[] args) {
        // NOTe: Stack is not part of Collections framwork
        // You should use a Deque instead
        Stack<Integer> numbers = new Stack<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.push(4);
        numbers.push(5);
        // Get the top number
        int five = nembers.peek();
        // Remove the top number
        int secondFive = number.pop(); // Remove t5, and it returns 5
        // Checks if stack is empty
        boolean isStackEmpty = numbers.empty();
        // Get size of stack
        int size = number.size();
    }
}
```

### Benefits

- It is very fast to insert and remove and element
- Hides the implementation details, simple interface
- Space efficient

### Drawbacks

- Limited functionality











































