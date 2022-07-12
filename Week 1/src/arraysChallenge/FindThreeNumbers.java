package arraysChallenge;
public class FindThreeNumbers {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;
        int[] integerArray = {a,b,c,a+b,a+c,a+c,a+b+c};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] < min) {
                secondMin = min;
                min = integerArray[i];
            }
            else if(secondMin > integerArray[i]){
                secondMin = integerArray[i];
            }
            if(max < integerArray[i]) {
                max = integerArray[i];
            }
        }
        System.out.println(min);
        System.out.println(secondMin);
        int max2 = max - (min + secondMin);
        System.out.println(max2);
    }
}
