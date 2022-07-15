package objectOrientedPrograming;
public abstract class Pet{
    public abstract void playSound();
    protected String Owner;
    public void adopt(String Owner){
        this.Owner = Owner;
    }
    public abstract void talkToOwner();
}
