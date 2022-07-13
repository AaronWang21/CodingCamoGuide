package objectOrientedPrograming;

public class Chair {
    public boolean canIBuy(double money){
        return money >= cost;
    }
    public void destroyChair(){
        cost = 0;
        numberOfLegs = 0;
        isOccupied = false;
    }
    int numberOfLegs;
    boolean isOccupied;
    double cost;
    public Chair(int numberOfLegs, boolean isOccupied, double cost){
        this.numberOfLegs = numberOfLegs;
        this.isOccupied = isOccupied;
        this.cost = cost;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
