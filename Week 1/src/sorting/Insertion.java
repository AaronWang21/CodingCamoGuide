package sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {4,5,7,3,8,6,90,3,1,92,191,181,171,471,271,101,281,391};
        insertionSortChallenge(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static void insertionSortChallenge(int[] array) {
            for (int i = 1; i < array.length; i++) {
                int j = array[i];
                int mover = i - 1;
                while (mover > -1 && smallerBigger(j,array[mover])) {
                    array[mover + 1] = array[mover];
                    mover--;
                }
            array[mover + 1] = j;
        }
    }
    public static boolean smallerBigger(int num, int num2){
        int place = 10;
        if(num == num2){
            return true;
        }
        while ((num % place) / (place / 10) == (num2 % place) / (place / 10)) {
            place *= 10;
        }
        return (num % place) / (place / 10) < (num2 % place) / (place / 10);
    }
}
