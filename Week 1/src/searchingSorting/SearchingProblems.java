package searchingSorting;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchingProblems {
    public static void main(String[] args) {
        int[] array = {8, 6, 2, 4};
        int[][] twoDimensionalArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(findInteger(array, 2));
        System.out.println(findAllIntegers(array, 2));
        System.out.println(Arrays.toString(find(twoDimensionalArray, 2)));
        System.out.println(linearSearch2DAll(twoDimensionalArray, 2));
    }

    public static Object findInteger(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]) {
                return array[i];
            }
        }
        return null;
    }

    public static Object findAllIntegers(int[] array, int num) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }

    public static int[] find(int[][] list, int a) {
        int[] b = new int[2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == a) {
                    b[0] = i;
                    b[1] = j;
                }
            }
        }
        return b;
    }

    public static ArrayList<String> linearSearch2DAll(int[][] ar, int value) {
        ArrayList<String> arr = new ArrayList<>();
        int[] fin = new int[2];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                if (ar[i][j] == value) {
                    fin[0] = i;
                    fin[1] = j;
                    arr.add(Arrays.toString(fin));
                }
            }
        }
        return arr;
    }
}