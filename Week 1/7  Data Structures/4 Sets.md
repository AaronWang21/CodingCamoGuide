# Sets

What if you don't care about the order of elements in a collection, You only want to find if an item exists or not? This is when we use `Set`s.

### Definition

A collection that cannot contain duplicates. Order does not matter in Sets.

### Set Concepts

Java's Collection Framework has `Set` interface. Two primary implementations of `Set` include `HashSet` and `TreeSet`.

### Example

This code creates a  `Set` of people in this class.

```java
public class Main{
    public static void main(String[] args) {
        //Hashset.
        Set<String> names = new HashSet<>();
        //HashSet<String> banes = new HashSet<>();
        ///Adding to a set.
        names.add("Remy");
        names.add("Victor");
        names.add("Jan");
        names.add("Felix");
        names.add("Joseph");
        names.add("Tom");
        names.add("Jan");
        names.add("Mathew");
        names.add("Aaron");
        names.add("Andrew");
        names.add("Eric");
        //Check if a name is in a set.
        boolean remyIsInSet = names.containt("Remy");
        //Remove from set.
        names.remove("Eric"); //Eric is no longer in the set.
    }
}
```

### `HashSet`

HashSets are implemented using a special internal array called a 
*HashTable*. that places elements into specific position based upon 
integers called *HashCodes*.

### Benefits of `HashSets`

- Constant time loopup
- Constant time insertion
- Constant time removal

### Drawbacks of `HashSet`

- It takes a lot of storage
- Bad Hashes will collide a lot, which will not guarantee the constant time.
- A hash function is needed for every object 
- It is not ordered

### `TreeSet` Examples

```java
public class Main{
    public static void main(String[] args) {
        //Creating a TreeSet
        Set<Integer> temparatures = new TreeSet<>();
        //TreeSet<Integer>temperatures = new TreeSet<>()
        //Adding
        temparatures.add(60);
        tempuratures.add(70);
        temperatures.add(88);
        temperatures.add(90);
        //Check if it contains a value
        boolean isThere90 = temperature.contains(90);
        //Remove a value
        temparatures.remove(70);
        //Print the numbers in sorted order
        for(int item : temparatures){
            System.out.println(item);
        }
    }
}
```

### TreeSets

A `TreeSet` uses an internal linked data structure called a Binary Search Tree to store its elements in sorted order.

### Benefits

- Everything is in sorted order
- Takes less space than `HashSet`
- Logarithmic time for insertion
- Logarithmic time for removal
- Logarithmic time for checking if a value is it set
- Time complexity is guaranteed

### Drawbacks

- Slower than `Hashset`

### Trees and binary search trees

A tree is an abstract data structure that represents a hiearchical tree structure with a set of connected nodes

![img_1.png](img_1.png)

A binary search tree is a tree data structure with the key of each internal node being greater than all the keys in the respective node's left subtree and less than the ones in its right subtree.

Red is preorder, green is in-order, and blue is post-order

![img_2.png](img_2.png)

### Set operationss

| Set Operation    | Method        | Description                                                        |
|------------------|---------------|--------------------------------------------------------------------|
| Union            | `addAll`      | Set of all elements that are in A, B, or Both                      |
| Intersection     | `retainAll`   | Set of all elements that are in both A and B                       |
| Differencce      | `removeAll`   | Set of all elements that are in A, but not in B                    |
| Superset, Subset | `SontainsAll` | Returns `true` if A is a superset of (contains all elements of) B  |

![img_3.png](img_3.png)

