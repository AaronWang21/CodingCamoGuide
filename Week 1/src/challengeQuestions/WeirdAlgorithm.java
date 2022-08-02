//package challengeQuestions;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long integer = sc.nextInt();
        while(integer != 1) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
                integer /= 2;
            }
            else {
                System.out.print(integer + " ");
                integer *= 3;
                integer += 1;
            }
        }
        System.out.println("1");
    }
}
