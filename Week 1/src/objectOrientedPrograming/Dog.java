package objectOrientedPrograming;

public class Dog extends Pet{
    @Override
    public void playSound() {
        System.out.println("Woof");
    }

    @Override
    public void talkToOwner() {
        System.out.println("Woof " + Owner);

    }

    public Dog(String Owner){
        this.Owner = Owner;
    }
}
