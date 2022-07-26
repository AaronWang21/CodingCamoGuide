package searchingSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,-6,78,74,74,7,66,-53,3,45,25,554,-54,5,54,54,5454,52,-35,352,3,5,0,-657,865,-76,57};
        System.out.println(binarySearch(arr, 0));
        System.out.println(recursiveBinarySearch(arr, 1, 0, arr.length - 1));
    }

    //Binary Search, We are trying to find the integer num within the array input
    public static int binarySearch(int[] input, int num) {
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (input[middle] == num) {
                return middle;
            } else if (input[middle] < num) {
                left = middle + 1;
            } else if (input[middle] > num) {
                right = middle - 1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] input, int num, int left, int right){
        if(input.length == 0){
            return -1;
        }
        int middle = (left + right) / 2;

        if(num == input[middle]){
            return middle;
        }
        else if (input[middle] < num) {
            recursiveBinarySearch(input,num,middle + 1, right);
        }
        else if (input[middle] > num) {
            recursiveBinarySearch(input,num,middle - 1, left);
        }
        return -1;
    }
}