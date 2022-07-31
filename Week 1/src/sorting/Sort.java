package sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,7,4,0};
        jsdli(arr, 0, 6);
        System.out.println(Arrays.toString(arr));
    }
    public static void jsdli(int[] array, int left, int right){
        int[] arr = new int[array.length];
        int temp = 0;
        int middle = array[3];
        for(int i = 0; i < array.length; i++){
            if(left < right){
                if(array[i] <= middle){
                    temp = array[left];
                    array[left] = array[i];
                    array[i] = temp;
                    left++;
                }
                else {
                    temp = array[right];
                    array[right] = array[i];
                    array[i] = temp;
                    right--;
                }
            }
        }
    }
}
