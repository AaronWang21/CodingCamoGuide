package objectOrientedPrograming;

public class PetMain {
    public static void main(String[] args) {
        Pet[] pets = new Pet[3];
        pets[0] = new Dog("Bob");
        pets[1] = new Cat("Victor");
        pets[2] = new Fish("Eric");
        for(int i = 0; i < pets.length; i++){
            pets[i].talkToOwner();
        }
    }
}
