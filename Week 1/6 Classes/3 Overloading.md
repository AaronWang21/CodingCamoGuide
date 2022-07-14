# Java Overloading

### Overloading

You have the same method name but different parameters  

```java
class Chair {
    public int numberOfLegs;
    public void addLeg(){
        numberOfLets++;
    }
    public void addLeg() {
        numberOfLegs += amount;
    }
}
```

It is used for different forms of the same method. So comeone can either `addLeg()` or `addLeg(4)`if they want to add mor than 1 leg.

```java
class Main{
    public static void main(String[] args) {
    Chair c= new Chair();
    c.numberOfLegs = 5;
    c.adLeg();
    c.adding(4);
    }
}
```

### Method Overloading

Methods with the same name but idfferent parameters..

Example is above

### Constructor Overloading

Having multiple constructors with different parameters.

```java
class Chair{
    public intnumberOfLegs;
    private boolean isOccupied;
    
    public Chair(){
        numberOfLegs = 4;
        isOccupied = false;
    }
    public Chair(int legs){
        numberOfLEgs = legs;
        isOccupied = false;
    }
    public Chair(int legs, boolean occupied){
        numberOfLegs = legs;
        isOccupied = occupied;
    }
}
```

Now, we can use these multiple constructors to create Chairs in different ways.

```java
class Main{
    public static void main(String[] args) {
        Chair c1 = new Chair(); //Uses constructor 1
        //c1 numberOfLegs = 4, isOccupied = false
        Chair c2 = new Chair(2); //Uses constructor 2
        //c2: number of legs = 2, isOccupied = false
        Chair c3 = new Chair(3, true); //Uses constructor 3
        //c3: number of legs = 3, isOccupied = true
    }
}
```

