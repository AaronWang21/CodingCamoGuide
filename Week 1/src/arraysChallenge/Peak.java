package arraysChallenge;
public class Peak {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        if(arr.length == 1){
            System.out.println("0");
        }
        for(int i = 0; i < arr.length; i++){
            if(i - 1 >= 0 && i + 1 < arr.length && arr[i - 1] < arr[i] && arr[i] > arr[i + 1]){
                System.out.println(i);
                break;
            }
            else if(i == 0 && arr[i] > arr[i + 1]){
                System.out.println(i);
            }
            else if(i == arr.length - 1 && arr[i] > arr[i - 1]){
                System.out.println(i);
            }
        }
    }
}