package sorting;

import java.util.Arrays;

public class TwoDArrayBubbleSort {
    public static void main(String[] args) {
        int[][] arr = {{4,5},{3,8},{9,3}};
        bubbleSort(arr);
        System.out.println(Arrays.deepToString(arr));
    }
    public static void bubbleSort(int[][] array) {
        int counter = -1;
        int temp = 0;
        int temp2 = 0;
        for (;;) {
            if(counter == 0){
                break;
            }
            counter = 0;
            for(int i = 0; i < array.length -1; i++){
                if (array[i][1] > array[i + 1][1]) {
                    temp = array[i][0];
                    temp2 = array[i][1];
                    array[i][0] = array[i + 1][0];
                    array[i][1] = array[i + 1][1];
                    array[i + 1][0] = temp;
                    array[i + 1][1] = temp2;
                    counter += 1;
                }
            }
        }
    }
}
