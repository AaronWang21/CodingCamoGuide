package competitiveProgramming;

import java.io.*;
import java.util.StringTokenizer;

public class BillboardTest {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader("billboard.in"));
        PrintWriter out = new PrintWriter(new FileWriter("billboard.out"));
        StringTokenizer st = new StringTokenizer(input.readLine());
        int r1x1 = Integer.parseInt(st.nextToken());
        int r1y1 = Integer.parseInt(st.nextToken());
        int r1x2 = Integer.parseInt(st.nextToken());
        int r1y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(input.readLine());
        int r2x1 = Integer.parseInt(st.nextToken());
        int r2y1 = Integer.parseInt(st.nextToken());
        int r2x2 = Integer.parseInt(st.nextToken());
        int r2y2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(input.readLine());
        int r3x1 = Integer.parseInt(st.nextToken());
        int r3y1 = Integer.parseInt(st.nextToken());
        int r3x2 = Integer.parseInt(st.nextToken());
        int r3y2 = Integer.parseInt(st.nextToken());
        int[][] array = new int[101][101];
        int counter = 0;
        for(int i = r1x1 + 50; i < r1x2 + 50; i++){
            for(int j = r1y1 + 50; j < r1y2 + 50; j++){
                if(i >= r3x1 + 50 && i <= r3x2 + 50 && j >= r3y1 + 50 && j <= r3y2 + 50){
                    array[i][j] = 1;
                }
            }
        }
        for(int i = r2x1 + 50; i < r2x2 + 50; i++){
            for(int j = r2y1 + 50; j < r2y2 + 50; j++){
                if(i >= r3x1 + 50 && i <= r3x2 + 50 && j >= r3y1 + 50 && j <= r3y2 + 50){
                    array[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < 101; i++){
            for(int j = 0; j < 101; j++){
                if(array[i][j] == 1){
                    counter += 1;
                }
            }
        }
        int length1 = r1y2 - r1y1;
        int width1 = r1x2 - r1x1;
        int length2 = r2y2 - r2y1;
        int width2 = r2x2 - r2x1;
        int rectangle1 = length1 * width1;
        int rectangle2 = length2 * width2;
        out.println(rectangle2 + rectangle1 - counter);
        out.close();
    }
}