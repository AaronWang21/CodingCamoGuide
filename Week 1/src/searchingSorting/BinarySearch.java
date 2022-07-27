package searchingSorting;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{5,7,10,11,15,20,21,22,23,27,30};
        ArrayList<Integer> Search = new ArrayList<>(List.of(5,7,10,11,15,20,21,22,23,27,30));
        System.out.println(binarySearch(4, Search));
    }

    //Binary Search, We are trying to find the integer num within the array input
    public static int binarySearch(int num,ArrayList<Integer> Search) {
        int left = 0;
        int right = Search.size() - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            Search.add(left);
            Search.add(right);
            Search.add(middle);


            if (Search.get(middle) == num) {
                return middle;
            } else if (Search.get(middle) < num) {
                left = middle + 1;
            } else if (Search.get(middle) > num) {
                right = middle - 1;
            }
            System.out.println(Search);
            System.out.println();
        }
        return -1;
    }
}