package challengeQuestions;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String stringInput = input.nextLine();
        int maxRowString = 1;
        int currentStringCount = 1;
        for(int i = 0; i < stringInput.length() - 1; i++){
            char c = stringInput.charAt(i);
            char c2 = stringInput.charAt(i + 1);
            if(c == c2){
                currentStringCount += 1;
            }
            else{
                currentStringCount = 1;
            }
            if(currentStringCount > maxRowString){
                maxRowString = currentStringCount;
            }
        }
        System.out.println(maxRowString);
    }
}