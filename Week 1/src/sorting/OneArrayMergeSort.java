package sorting;
import java.util.Arrays;
public class OneArrayMergeSort {
    public static void main(String[] args) {
        int[] arr2 = new int[]{2,3,5,7,11,14,36,1,4,6,8,9,13,22,33,45};
        merge(arr2, 7);
        System.out.println(Arrays.toString(arr2));
    }
    public static void merge(int[] array3, int x) {
        int[] array2 = new int[(x)];
        int[] array = new int[(array3.length - x)];
        for(int i = 0; i < x; i++){
            array2[i] = array3[i];
        }
        for(int i = x; i < array3.length; i++){
            array[i - x] = array3[i];
        }
        int pointer1 = 0;
        int pointer2 = 0;
        for (int i = 0; i < array3.length; i++) {

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
