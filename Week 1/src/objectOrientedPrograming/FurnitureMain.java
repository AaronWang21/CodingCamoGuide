package objectOrientedPrograming;

public class FurnitureMain {
    public static void main(String[] args) {
        Furniture f = new Furniture();
        Furniture c = new Chair(4,false,0);
        Furniture t = new Table();
        f.performTask();
        c.performTask();
        t.performTask();
    }
}
