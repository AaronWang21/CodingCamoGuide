package competitiveProgramming;
import java.util.Scanner;
public class IncreasingArray {
    public static void main(String[] args) {
        long total = 0;
        Scanner input = new Scanner(System.in);
        long integer = input.nextInt();
        long[] arr = new long[(int)(integer)];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextLong();
        }
        for(int j = 1; j < arr.length; j++){
            if(arr[j] < arr[j-1]){
                total += (arr[j-1] - arr[j]);
                arr[j] = arr[j-1];
            }
        }
        System.out.println(total);
    }
}