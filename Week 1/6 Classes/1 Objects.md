# Objects

### Object-Oriented Programming (OOP)

Reasoning about a program as a set of objects rather than actions.

### Object

A programing entity that contains state (data) and behaviors (methods).

### State

A set of values (internal data) stored in an object

```java
class Chair{
    int numberOfLegs;
    boolean hasCushion;
    String nameOfPersonSittingOnTheChair;
    boolean isThisChairBroken;
)
```

### Behavior
set of actions an object can perform, often reporting or modifying its internal state.

```java
class Chair{
    int numberOfLegs;//This is a state
    //these are behaviors
    public void breakChair(){
        numberOfLegs = 0;
    }
    public void grouwChair(){
        numberOfLegs = 4;
    }
}
```

### Client

The code that interacts with the class/objects of the class.

Think of this:
Chair is the class.
Each chair you create is the object.

Basically, classes are blueprints, objects are what you make from the blueprints

```java
class Main{
    Public static void main(String[] args) {
        Chair remysChair = new Chair();
        remysChair.growChair();
        remysChair.breakChair();
        Chair arronsChair = new Chair();//different chair
        remysChair.growChair();
        aaronsChair.growChair();
        remyysChair.breakChair();
        System.out.println("Aarond's chair has " + arroneChair.legs + "legs");
        System.out.println("Remy's chair has " + remysChair.legs + "legs");
    }
}
```

