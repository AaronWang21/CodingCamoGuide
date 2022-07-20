# Queues

You have a single machine, but you have a lot of tasks coming in. Which task do you proccess first?
One way to do it is to process the tasks in the order they come in. The data structure that allows us to do this is called Queue.

### Definition

An ordered collection that allows adding the "back" element and removing the "front" element, providing First-In, First-Out (FIFO) access. The first element goes out first.

### Example

If I put the 1, 2, 3, 4, 5 in a queue, and remove the in order, they would be 1, 2, 3, 4, 5.

### Java Example

```Java
public class Main{
    public static void main(String[] args) {
        Queue<String> luchLine = new LinkedList<>();
        // Queue<String> lunchLine = new ArrayDeque<>();
        // Add to a queue
        luchLine.add("Remy");
        luchLine.add("Aaron");
        // Get the first element of a queue
        String remy = lunchLine.peek();
        // Remove the first element of a queue
        String remy2 = lunchLine.remove*(); // Remove "Remy" and returns "Remy"
        // Check if queue is empty
        bollean empty = lunchLine.isEmpty();
        // Get size of queue
        int size = lunchLine.size();
    }
}
```

### Benifits

- A simple interface (not many methods)
- It is fast (all operations are constant time)

### Drawbacks

- Limited functionality (only First-In, and First-Out)

