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