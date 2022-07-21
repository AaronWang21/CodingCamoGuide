public class RecursionChallenges {
    public static void main(String[] args) {
        System.out.println(number(10));
    }

    public static int number(int num) {
        if (num > 1) {
            return num * number(num - 1);
        }
        else{
            return num;
        }
    }
}