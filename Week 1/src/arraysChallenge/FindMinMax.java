package arraysChallenge;

public class FindMinMax {
    public static void main(String[] args) {
        long[] arr = {3,2,1};
        long min = arr[0];
        long max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
