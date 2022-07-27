package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 5, 4};
        InsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void InsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = array[i];
            int mover = i - 1;
            while (mover > -1 && j < array[mover]) {
                array[mover + 1] =  array[mover];
                mover--;
            }
            array[mover + 1] = j;
        }
    }
}