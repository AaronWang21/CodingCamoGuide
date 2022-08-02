package challengeQuestions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class inputOut {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long times = Integer.parseInt(br.readLine());
        long arr[] = new long[(int) times];
        StringTokenizer A = new StringTokenizer(br.readLine());
        for(long i = 0; i < times; i++){
            arr[(int) i] = Long.parseLong(A.nextToken());
        }
        long max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[(int) i] > max){
                max = arr[(int) i];
            }
        }
        System.out.println(max);
    }
}
