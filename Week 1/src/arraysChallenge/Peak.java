package arraysChallenge;
public class Peak {
    public static void main(String[] args) {
        int[] integerArray = {5,6,2,7,10,2,-1,5};
        for(int i = 0; i < integerArray.length; i++){
            if(i - 1 > 0 && i + 1 < integerArray.length && integerArray[i - 1] < integerArray[i] && integerArray[i] > integerArray[i + 1]){
                System.out.println(i);
                break;
            }
        }
    }
}
