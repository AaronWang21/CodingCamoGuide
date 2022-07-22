package treesGraphsRecursion.recursion;

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
    public static void numberLoop(int[] array, int index){
        if (index != array.length){
            System.out.println(array[index]);
            numberLoop(array,index + 1);
        }
    }
    public static int addNumbers(int[] array, int index){
        if(index == array.length){
            return 0;
        }
        return addNumbers(array, index + 1) + array[index];
    }
}