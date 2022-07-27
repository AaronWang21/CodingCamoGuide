package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,8,2,3,4,1,9,6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] array){
        int min = array[0];
        int i = 0;
        for(int index = 0; index < array.length; index++){
            i = index;
            min = array[index];
            int index2 = index;
            while(i < array.length){
                if(min > array[i]){
                    min = array[i];
                    index2 = i;
                }
                i++;
            }
            int temp = array[index2];
            array[index2] = array[index];
            array[index] = temp;
        }
    }
}
