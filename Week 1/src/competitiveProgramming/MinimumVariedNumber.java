package competitiveProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.StringTokenizer;
public class MinimumVariedNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(input.readLine());
        PrintWriter out = new PrintWriter(System.out);
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(input.readLine());
            int[] a = new int[n];
            int[] b = new int[n];
            @SuppressWarnings("unchecked")
                ArrayList<Integer>[] adj = new ArrayList[n];
            for(int j = 0; j < n; j++){
                adj[j] = new ArrayList<>();
            }
            for(int j = 1; j < n; j++){
                StringTokenizer st = new StringTokenizer(input.readLine());
                int pj = Integer.parseInt(st.nextToken()) - 1;
                a[j] = Integer.parseInt(st.nextToken());
                b[j] = Integer.parseInt(st.nextToken());
                adj[pj].add(j);
            }
            int[] answer = new int[n];
            name(0,0, 0,a,b, answer, 0, adj, new ArrayDeque<>());
            for(int j = 1; j < n; j++){
                out.print(answer[j]);
                out.print(" ");
            }
            out.println();
        }
        out.flush();
    }
    public static void name(int index, int aSum, int bSum, int[] a, int[] b, int[] answer, int depth, ArrayList<Integer>[] adj, ArrayDeque<Integer> adq){
        aSum += a[index];
        while(!adq.isEmpty() && adq.getFirst() + bSum < aSum){
            depth++;
            bSum += adq.getFirst();
            adq.removeFirst();
        }
        adq.addLast(b[index]);
        answer[index] = bSum;
        for(int child : adj[index]){
            name(child, aSum, bSum, a, b, answer, depth + 1, adj, adq);
        }
        adq.removeLast();
    }
}