package sorting;

import java.util.Arrays;

public class CountingSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 7, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] array) {
        int[] arr = new int[8];
        for (int i = 0; i < array.length; i++) {
            arr[array[i]] += 1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                array[index] = i;
                index++;
            }
        }
    }
}
