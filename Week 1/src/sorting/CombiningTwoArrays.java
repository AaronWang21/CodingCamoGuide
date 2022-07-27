package sorting;

import java.util.Arrays;

public class CombiningTwoArrays {
    public static void main(String[] args) {
        int[] arr = {4,5,3,8,9,3};
        int[] arr2 = {4,5,3,8,9,3};
        int[] arr3 = combiningArray(arr, arr2);
        System.out.println(Arrays.toString(arr3));
    }
    public static int[] combiningArray(int[] array, int[] array2){
        int sum = array.length + array2.length;
        int[] emptyArray = new int[sum];
        int j = 0;
        int secondJ = 0;
        for(int i = 0; i < emptyArray.length; i++){
            if(secondJ < array2.length && j < array.length){
                if(array[j] <= array2[secondJ]){
                    emptyArray[i] = array[j];
                }
                else if(array[j] >= array2[secondJ]){
                    emptyArray[i] = array2[secondJ];
                    secondJ++;
                }
            }
            else{
                if(){

                }
                else if(){

                }
            }
        }
        return emptyArray;
    }
}
