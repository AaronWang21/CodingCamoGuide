package searchingSorting;

public class ReverseBinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8};
        System.out.println(reverseBinarySearch(array, 2));
        System.out.println(recursiveBinarySearch(array, 2, 0, array.length - 1));
    }
    public static int reverseBinarySearch(int[] input, int num) {
        int left = 0;
        int right = input.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (input[middle] == num) {
                return middle;
            } else if (input[middle] < num) {
                right = middle - 1;
            } else if (input[middle] > num) {
                left = middle + 1;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] input, int num, int left, int right){
        if(left > right){
            return -1;
        }
        else{
            int middle = (left + right) / 2;
            if(input[middle] == num){
                return middle;
            }
            else if(input[middle] < num){
                return recursiveBinarySearch(input, num, middle + 1, right);
            }
            else if(input[middle] > num){
                return recursiveBinarySearch(input, num, left, middle - 1);
            }
        }
        return -1;
    }
}