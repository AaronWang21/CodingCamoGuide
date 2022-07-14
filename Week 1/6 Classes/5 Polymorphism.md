# Polymorphism!

Remeber doing `Object  = new Chair();`? Polymorphism is a powerful way to treat different objects part of the same superclass the same way.

### Polymorphism (Definition)

The ability for the same code to be use with several different types of object and for the code to behave differently depending on the actual type of object used.

### Polymorphism (Real life definition)

Occuring in several different forms.

In java. these objects of a superclass can occur if different forms, but we want them to have the same method names that behave differently.

### Examples

```java
class Furniture{//superclass
    int durability = 100;
    public void destroy(){
        durability = 0;
    }
    //avaliable to all furniture object
    public void buildFurniture(){
        durability = 150;
    }
}
class Chair extends Furniture{ //subclass
    @Overide
    public void destroy(){
        durability = 50;
    }
    //Only avaliable to Chair objects
    public vodi buildChair(){
        durability = 100;
    }
}
class Table extends furniture{//subclass of Furniture
    @Override
    public void ddestroy(){
        durability = 25;
    }
    //only avaliable to Table objects
    public void buildTable(){
        durability = 50;
    }
}
```

Now for the client class to implemetn polymorphism:

```java
class Main{
    public static void main(String[] args) {
        Furniture c = new Chair();//furniture thats created as a Chair
        Furniture t = new Table();//Furniture thars created as a Table
        //This is polymorphism!
        
        //WHAT CAN C ANT T DO???
        c.buildChair(); //CANNOT DO: WILL NOT WORK, ONLY FOR CHAIR OBJECTS
        c.destroy(); //ddestroy to 50 because it uses overridden . destroy()
        t.buildTable(); //DOES NOT WORK! ONLY FOR TABLE OBJECTS, NOT FURNITURE
        t.destroy();//destory to 25 because Table overridden . destroy()
    }
}
```

### Cunstructors in polymorphism

Constructors are not not polymorphic; `Furniture c = new Chair()`, the `Chair` constructor is the one being called, not `Furnitire`