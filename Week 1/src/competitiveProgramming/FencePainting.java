package competitiveProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class FencePainting {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("paint.in"));
        PrintWriter out = new PrintWriter(new FileWriter("paint.out"));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(input.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int total = 0;
        int[] array = new int[100];
        for(int i = a; i < b; i++){
            array[i] = 1;
        }
        for(int j = c; j < d; j++){
            array[j] = 1;
        }
        for(int i = 0; i < 100; i++){
            total += array[i];
        }
        out.print(total);
        out.close();
    }
}
