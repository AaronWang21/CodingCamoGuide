package sorting;

import java.util.Arrays;

public class ReverseBubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,9,6,9,3,1};
        reverseBubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseBubbleSort(int[] array) {
        int counter = 0;
        int temp = 0;
        for (;;) {
            if(counter == array.length - 1){
                break;
            }
            counter = 0;
            for(int i = 0; i < array.length - 1; i ++ ){
                if (array[i] >= array[i + 1]) {
                    counter += 1;
                }
                else if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }
}
