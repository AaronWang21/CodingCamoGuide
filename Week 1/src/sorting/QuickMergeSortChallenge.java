package sorting;

import java.util.Arrays;

public class QuickMergeSortChallenge {
    public static void main(String[] args) {
        int[] arr2 = new int[]{7, 3, 4, 8, 13, 22, 3, 6, 7, 18, 9, 16};
        //int[] arr2 = new int[]{5,3,5,7,11,14,36,1,4,6,8,9,13,22,33,45};
        merge(arr2, 2,5, 9);
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(int[] array3, int left, int middle, int right){
        int[] array2 = new int[(middle - left)];
        int[] array = new int[(right - middle)];
        for(int i = left; i < middle; i++){
            array2[i - left] = array3[i];
        }
        for(int i = middle + 1; i <= right; i++){
            array[i - middle - 1] = array3[i];
        }
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = left; i < right; i++) {

            if (pointer1 < array.length && pointer2 < array2.length && array[pointer1] < array2[pointer2]) {
                array3[i] = array[pointer1];
                pointer1++;
            }
            else if (pointer1 < array.length && pointer2 < array2.length && array[pointer1] >= array2[pointer2]) {
                array3[i] = array2[pointer2];
                pointer2++;
            }
            else {
                if (pointer1 >= array.length) {
                    array3[i] = array2[pointer2];
                    pointer2++;
                }
                else if (pointer2 >= array2.length) {
                    array3[i] = array[pointer1];
                    pointer1++;
                }
            }
        }
    }
}