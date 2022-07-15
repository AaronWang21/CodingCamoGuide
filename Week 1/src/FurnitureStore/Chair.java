package FurnitureStore;

public abstract class Chair implements Furniture{
    protected int defence;
    protected int durability;
    protected int cost;
    protected String occupant;

    public Chair(int defence, int durability, int cost, String occupant) {
        this.defence = defence;
        this.durability = durability;
        this.cost = cost;
        this.occupant = occupant;
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
