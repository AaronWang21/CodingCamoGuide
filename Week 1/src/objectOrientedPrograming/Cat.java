package objectOrientedPrograming;

public class Cat extends Pet {
    @Override
    public void playSound() {
        System.out.println("Meow");
    }

    @Override
    public void talkToOwner() {
        System.out.println("Meow " + Owner);
    }

    public Cat(String Owner){
        this.Owner = Owner;
    }
}
