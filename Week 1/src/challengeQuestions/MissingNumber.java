package challengeQuestions;

import java.util.Scanner;

public class MissingNumber {
    public static void missingNumber(){
        Scanner n = new Scanner(System.in);
        long integer = n.nextInt();
        long i = integer;
        while(integer != 0){
            if(integer != i){
                System.out.println(i);
            }
            else{
                integer--;
                i--;
            }
        }
    }
}
