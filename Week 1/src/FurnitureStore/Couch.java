package FurnitureStore;

import java.util.ArrayList;

public abstract class Couch implements Furniture{
    protected int durability;
    protected int cost;
    protected int defence;
    protected ArrayList<String> occupants;

    public Couch(int durability, int cost, int defence, ArrayList<String> occupants) {
        this.durability = durability;
        this.cost = cost;
        this.defence = defence;
        this.occupants = occupants;
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