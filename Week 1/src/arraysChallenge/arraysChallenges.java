package arraysChallenge;
import java.util.Arrays;
public class arraysChallenges {
    public static void main(String[] args) {
        int[] integerArray = new int[15];
        int[] numberArray = {43, 64, 2, 4, 6};
        int firstNumber= numberArray[0];
        int lastNumber = numberArray[numberArray.length - 1];
        numberArray[4] = 5;
        System.out.println(Arrays.toString(numberArray));
        String s = Arrays.toString(numberArray);
        for(int i = 0; i < numberArray.length; i++){
            System.out.println(numberArray[i]);
        }
        for(int element:numberArray){
            System.out.println(element);
        }
        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = numberArray[i] + 1;
        }
    }
}
