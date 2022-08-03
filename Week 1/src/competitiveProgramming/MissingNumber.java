package competitiveProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int maxNumber = Integer.parseInt(br.readLine());
        String input = br.readLine();
        String[] splitter = input.split(" ");
        int[] inputArray = new int[maxNumber - 1];
        for(int i = 0; i < splitter.length; i++) {
            inputArray[i] = Integer.parseInt(splitter[i]);
        }
        int sum = 0;
        for(int i = maxNumber; i != 0; i--){
            sum += i;
        }
        for(int indexOfArray = 0; indexOfArray < inputArray.length; indexOfArray++){
            sum -= inputArray[indexOfArray];
        }
        System.out.println(sum);
    }
}