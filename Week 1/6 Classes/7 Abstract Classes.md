#  Abstract Classes

Suppose we want out interface `Furniture` to have its own methods and fields as well for all out furniture to use!

Instead of an interface, we use an Abstract Class.

### Abstract Class

A java class that cannot be instantiated, but instead serves as a superclass to hold common code and declare abstract behavior.

In other words:

It's like a combination between interfaces and classes. You can declare methods that subclasses are required to implement, but you can ALSO create its own methods.

For example, if `Furniture` is no longer an interface but an `abstract class1, it has the ability to have its own methods and fields.

however, you cannot do `Furniture f = new furniture()` anymore as abstract classes, cannot nbe instantiated. But, you can do `Furniture c = new Chair()`.

### Implementing an Abstract Class:

Let's make `Furniture` jinto an `abstract class` 

```java
public abstract class Furniture{
    protected int durability;
    protected int numberOfLEgs;
    
    //we want difrerent furniture to lose different durability on destroy
    public abstract void destroy();
    
    public void burn(){
        //burning furniture has negative gurability for all furniture
        durabiliy = -50;
    }
    
    public abstract void removeLegs(); // =remove different legs for each subclass
    
    public removeALLLegs(){
        numberOfLEgs = 0;
    }
}
```

A few notes:

We must say `puliv abstract class` tp make an abstract class.

We use `protected` to allow subclasses to access fields (but, other classes can't).

We use `public abstracet` in order to require a method for subclasses to implement.

We can create normal methods for `Furniture` as well that subclasses inherit.

```java
import objectOrientedPrograming.Furniture;

public class Chair {
    public Chair(int durability, int numberOfLegs) {
        this.durability = durability;
        this.numberOfLegs = numberOfLegs;
    }

    public void destroy() {
        durability -= 10;
    }

    public void removeLegs() {
        numberOfLegs -= 2
    }
}
public class Table extends Furniture{
    public Table(int durability, int numberOfLegs){
        this.durability = durability;
        this.numberOfLegs = numberOfLegs;
    }
    public void destroy(){
        durability -= 30;
    }
    public void removeLegs(){
        numberOfLegs -= 3;
    }
}
```
Now, let's use a main class to implement our cclasses.

```java
class Main{
    public static void main(String[] args) {
        Furniture[] onDisplay = new Furniture[4];
        onDisplay[0] = new Chair(100, 6);
        onDisplay[1] = new Table(50, 4);
        onDisplay[2] = new Chair(200, 12);
        onDisplay[3] = n32 Table(80, 2);
        
        for(int i = 0; i < onDisplay.length; i++){
            onDisplay[i].destroy();
            onDisplay[i].burn();
            onDisplay[i].removeLegs();
            onDisplay[i].removeAllLegs();
            //we know all Furniture subclasses have these methods
            //because they are either required or inherited
        }
    }
}
```

Thatn is the magic of abstract classes!