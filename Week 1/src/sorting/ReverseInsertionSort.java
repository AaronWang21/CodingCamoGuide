package sorting;

import java.util.Arrays;

public class ReverseInsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,8,6,9,3,1};
        reverseInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = array[i];
            int mover = i - 1;
            while (mover > -1 && j > array[mover]) {
                array[mover + 1] =  array[mover];
                mover--;
            }
            array[mover + 1] = j;
        }
    }
}
