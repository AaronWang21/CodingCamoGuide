package arraysChallenge;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter array size: ");
        Scanner input = new Scanner(System.in);
        int arraySize = input.nextInt();
        int[] arr = new int[arraySize];

        for(int i = 0; i < arraySize; i++){
            arr[i] = i;
        }

        for(int i = 0; i < arraySize; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Reversed:");

        for(int i = arr.length - 1; i >= 0 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}