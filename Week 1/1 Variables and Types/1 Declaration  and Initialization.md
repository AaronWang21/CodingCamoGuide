# Variables and Types

### Variables

Variable: A variable stores data (numbers, letters, strings, arrays (like grids), etc)

`int yeat;`

### Types

The type of data that the cariable represents

`String` `boolean` `int` etc

### Declaration

Where the variable is created.
Shown by typing the type name by the variable name

`int variable`

### Initialization

Where the variable's value is set.

`variable = 10;` or `int cariable = 10;`

---
# Implementation

```java
public class Main{
    public static void main(String[] args) {
        int lastYear = 2021;//declaration and initialization
        int thisYear;//declaration
        thisYear = 2021;//initialization
        String hello = "Hello World";
    }
}
```


#### Reference Type and Object Initialization

Reference types AND Objects initialize with type, name, equals sign, then "new", type, then parenthesis

`Object obj = new Object();`

`Scanner sc = new Scanner(System.in);`

### Naming Convention

All variable names are in pascalCase: first letter lowercase, all words after start upper case. `int hellowWorld`


All primitive types such as `int` are lower case

All object types such as `Object` `Scanner` `ArrayList` are CamelCase where all first letters are capitalized