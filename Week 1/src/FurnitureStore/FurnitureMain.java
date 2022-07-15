package FurnitureStore;
import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureMain {
    private static int cash = 100;
    private static ArrayList<Furniture> inventory = new ArrayList();
    private static ArrayList<Furniture> store = new ArrayList<>();
    public static void main(String[] args) {

        int cash = 100;
        int numberOfDays = 100;
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i+1));
            while (true){
                Scanner sc = new Scanner(System.in);
                System.out.println("Do you want to work or buy");
                String input = sc.nextLine();
                if (input.equalsIgnoreCase("work")){
                    work();
                    break;
                }
                else if(input.equalsIgnoreCase("buy")){
                    buy();
                    break;
                }
                else{
                    System.out.println("Invalid Input");
                }
            }
        }
    }
    public static void work(){
        for(Furniture f:inventory){
            
        }
    }
    public static void buy(){

    }
}
