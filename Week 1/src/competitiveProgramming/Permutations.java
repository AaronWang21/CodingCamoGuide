package competitiveProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int integer = Integer.parseInt(input.readLine());
        PrintWriter out = new PrintWriter(System.out);
        long counter = 2;
        boolean goOn = false;
        if(integer < 4){
            if(integer == 1){
                System.out.print("1");
            }
            System.out.println("NO SOLUTION");
        }
        else{
            while(counter <= integer){
                out.print(counter);
                out.print(" ");
                counter += 2;
                if (!goOn) {
                    if(counter == integer) {
                        out.print(counter);
                        out.print(" ");
                        counter = 1;
                        goOn = true;
                    }
                    if(counter == integer - 1) {
                        out.print(counter);
                        out.print(" ");
                        counter = 1;
                        goOn = true;
                    }
                }
            }
        }
        out.flush();
    }
}