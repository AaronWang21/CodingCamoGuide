package FurnitureStore;

public abstract class Table implements Furniture{
    protected int defence;
    protected int durability;
    protected int cost;
    protected int numberOfLaptops;

    public Table(int defence, int durability, int cost, int numberOfLaptops) {
        this.defence = defence;
        this.durability = durability;
        this.cost = cost;
        this.numberOfLaptops = numberOfLaptops;
    }
    public int getCost(){
        return cost;
    }
    public int getDurability(){
        return durability;
    }
    public int getDefense(){
        return defence;
    }
    public void decreaseDurability(){
        durability--;
    }
    public void onDestroy(){
        defence = 0;
    }
}
