package competitiveProgramming;
import java.io.*;
import java.util.*;

public class SquarePasture{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("square.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("square.out")));

        int maximumX = 10;
        int minimumX = 0;
        int maximumY = 10;
        int minimumY = 0;

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int bottomLeftCoordinateX = Integer.parseInt(st.nextToken());
            int bottomLeftCoordinateY = Integer.parseInt(st.nextToken());
            int topRightCoordinateX = Integer.parseInt(st.nextToken());
            int topRightCoordinateY = Integer.parseInt(st.nextToken());

            if(bottomLeftCoordinateX < maximumX) {
                maximumX = bottomLeftCoordinateX;
            }
            if(topRightCoordinateX > minimumX) {
                minimumX = topRightCoordinateX;
            }
            if(bottomLeftCoordinateY < maximumY) {
                maximumY = bottomLeftCoordinateY;
            }
            if(topRightCoordinateY > minimumY) {
                minimumY = topRightCoordinateY;
            }
        }
        int total = minimumX - maximumX;
        if(minimumY - maximumY > minimumX - maximumX) {
            total = minimumY - maximumY;
        }
        pw.println(total * total);
        pw.close();
    }
}