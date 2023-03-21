# Classes and Objects

All activity in Java happens within a class so technically we have been making use of them since the very beginning. Just, thus far, our classes have been really simple and we adopted a more imperative style approach. To explain, we have been using classes to just organise our code.

It is finally time to really get into Object-Oriented Programming, and discover the features that make Java so popular amongst back-end developers. 

# IB Learning Outcomes

- D.1.1 Outline the general nature of an object.
- D.1.2 Distinguish between an object instance and a class.
- D.3.4 Describe the use of primitive data types and the reference class string.

## 7.3 Objects

You need to understand two fundamental facts...

- A class is a template that defines the form of an object.
- An object is a particular instance of a class.

The class is a *logical abstraction* and does not really take memory space during program execution. It is only until instances have been created (as concrete representations) that we start to consume memory. 

We will learn that classes contain variables, also known as object properties, and methods, which we sometimes refer to as behaviour. 

*This links with CCS pages 292 - 294, D.1.2 Distinguishing between object and instantiation.*

## 7.4 Defining your first class

A class is created by using the keyword `class`. As we have seen previously it is very possible to create classes with just methods. Similarly, it is technically possible to just create classes that contain only variables. However, we generally create objects that model real world objects and processes so it is very common to define classes that contain both variables and methods.

```
public class Soldier {
    // declare variables
    public int health;

    // declare methods
    public void reduceHealth() {
        this.health = this.health - 1;
    }
}
```

In previous lessons we have designed an entity for *Soldier*, and today we are going to translate it into a class in Java. It will store information about its health, minor profile details, inventory of weapons and keep track of the current weapon being used by the character.

## 7.5 Create your first object *instance*

In Java, anything that is not a primitive data type is an object therefore without really appreciating it perhaps, we already gained some experiencing creating physical objects when dealing with arrays.

```
// from lesson 07
int[] myNumbers = new int[100];
```

I would like to make special attention to the `new` keyword as it is common in any object you create. The `new` operator allocates memory for an object and returns a reference to it during run-time.

Let's look at the creation of a `Soldier` instance as an example, the following resides in <b>SoldierFactory.java</b>:

```
Soldier jack = new Soldier(); // declare and create physical instance of Soldier
```

The above declaration does two things:
1. Declares a variable called *jack* of the type *Soldier*
2. Creates a physical copy of the object and assigns a unique reference to *jack*

To really showcase the above, we could have rewritten the statement above to show the steps individually:

```
Solder jack;
jack = new Soldier();
```
## Assigning values to properties and calling object methods

After you created a physical copy of a class, then you should have access to properties and make use of them in your program. For example assigning a value to a property:

```
jack.name = "Jack"; // assigning a value to a property
```

However as already mentioned in previous lessons it is a very good idea to use object methods to change properties e.g.

```
jack.reduceHealth();
System.out.println(jack.health); // should print out 3
```

But don't worry too much about this point because we will be diving into OOP slowly. For now, we want to get comfortable with the basics.

## 7.6 Strings

Java treats a datum like `"Ms. Camilleri"` which we refer to as <b>text</b> as an object that is composed of a collection (array) of characters or bytes (recall that a single ASCII character can be represented in a byte). 

For textual data, Java offers a powerful utility class (template) called `String`. To store textual data in memory then you need to instasiate a `new` object like so:

```
String myName = new String(); // very similar to our soldier example
```



## Some tips

- A class should define one and only one logical entity. Putting a lot of unrelated information in a single object goes against the principle.
- Object classes should not declare the main method. You should always have a separate class to declare the entry point of your program.
- Have another class to create object instances.
