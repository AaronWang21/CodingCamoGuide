# Searching

Searching is a process where we find the existence of some object within some set of objects. There are many variations of searching, and it can be done on many data structures such as arrays or graphs.

## Linear Search

Given an array, we want to find whether an element exists in that array. We do this by traversing through the array with a for loop.

```java
public class Main {
    public static int findInteger(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
```

Here we take in the input array `array` and an integer `num` that we are searching for. We use a for loop to loop through the entire array and if we find the value in the array equal to num, we return that value.

## Binary Search

A way to search for a number in an array in logarithmic time. We can check whether an element exsists in the array without checking all of the elements in the array. However, this only works for sorted arrays.

```java
public class Main {
    public static int binarySearch(int[] input, int num) {
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (input[middle] == num) {
                return middle;
            } else if (input[middle] < num) {
                left = middle + 1;
            } else if (input[middle] > num) {
                right = middle - 1;
            }
        }
        return -1;
    }
}
```

Binary search works by having the data at every search at every step. We look at the element in the middle of our array, and compare that to the number we are searching for. If the number is bigger than we can delete the bottom half of our array, and if the number is smaller, then we can delete the top half of our array. We repeat this process again with our new, smaller array, and keep doing this until we either find the number of the array because size 0.