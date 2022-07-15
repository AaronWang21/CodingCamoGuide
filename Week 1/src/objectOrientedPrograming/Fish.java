package objectOrientedPrograming;

public class Fish extends Pet{
    @Override
    public void playSound() {
        System.out.println("Swish");
    }

    @Override
    public void talkToOwner() {
        System.out.println("Swishes water at " + Owner);
    }

    public Fish(String Owner) {
        this.Owner = Owner;
    }
}
