package sorting;
import java.util.Arrays;
public class ReverseSelectionSort {
    public static void main(String[] args) {
        double[] arr = {4,5,7,3,8,6,9,3,1};
        reverseSelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverseSelectionSort(double[] array){
        double max = array[0];
        int i = 0;
        for(int index = 0; index < array.length; index++){
            i = index;
            max = array[index];
            int index2 = index;
            while(i < array.length){
                if(max < array[i]){
                    max = array[i];
                    index2 = i;
                }
                i++;
            }
            double temp = array[index2];
            array[index2] = array[index];
            array[index] = temp;
        }
    }
}