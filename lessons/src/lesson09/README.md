# Inheritance

One of the *greatest benefits* of the object-oriented approach to software development is that it offers the opportunity for us to <ins>reuse classes that have already been
written — either by ourselves or by someone else</ins>. For example, you have an idea for a cool mobile app and you are thinking of using Android Studio with an Android SDK. This is of course the right decision! Life is too short to build everything from scratch. Android Studio have written for us many classes in Java that define how any mobile app should behave, and for your specific mobile app, you could reuse a lot of the code. Your code will act as an *extension* to the basic infrastructure provided by the SDK. We call this <b>inheritance</b>.

# IB Learning Outcomes

- D.1.3 Construct Unified Modelling Language (UML) diagrams to represent object designs.
- D.1.4 Interpret UML diagrams.
- D.1.5 Describe the process of decomposition into several objects.
- D.1.6 Describe the relationships between objects of a given problem.
- D.1.7 Outline the need to reduce dependencies between objects in a given problem (SOLID).
- D.2.2 Define the term Inheritance and Outline Advantages

## 9.2 Defining Inheritance

### OOP Features. Four Pillars: Abstraction, Encapsulation, Inheritence and Polymorphism

In the last lesson we defined *Abstraction* and *Encapsulation*. Now, we obviously move on to...

<ins>Inheritance</ins>

Inheritance is the sharing of attributes and methods among classes by using the `extends` keyword in Java. We can take one class, and then define other classes based on the first one. The new classes inherit all the attributes and methods of the first one, but may have attributes and methods of their own. The new classes are able to access any `protected` attributes as though they have been defined within that class.

This defines the "is-a" relationship and perhaps one of the most easiest to grasp and explain.

1. Lions, tigers and persians are different animals but they are all *Cats*.
2. Squares, triangles and circles have different mathematical properties but they are all *Shapes*.
3. Ford, BMW, Lamborghini come from different manufacturers but they are all *Cars*.

The above implies that even though objects are different, at the core they are grouped because they share some fundamental concepts.

A cat is a cat because an animal is: nocturnal, territorial, solitary, predatory and maternal-sexual.

A shape is a shape because a continuous line is eventually closed forming a boundary.

A car is a car because it is a wheeled vehicle for the purpose of transportation.

```java
public class Lion extends Cat { ... }

public class Ford extends Car { ... }

public class Circle extends Shape { ... }
```

## 9.3 Implementing Inheritance in Java

Inheritance allows the sharing of attributes and methods among different classes. In the examples above, `Lion` will *inherit* all the attributes and methods defined in `Cat`. 

When something is this easy to understand, it is tempting to define such strong dependencies in the code, but beware, because the examples given do not quite obey SOLID principles. When you want to use this feature always keep in mind <b>Interface Segregation</b> and <b>Open-closed</b>. A class that is designed to be inherited from should be generic, and describe a *contract of business*. 

Example:
<img src="https://raw.githubusercontent.com/stedwardscollegemt/ib-java-code-leaps-2024/main/lessons/img/inheritence_example.jpg">


```java
public class MainMeal extends FoodItem {

    /*---- Attributes -----------------------------------------------------------------*/
    protected SideItem side;

    protected DrinkItem drink;

    // and all the attributes in FoodItem are automatically inherited
}
```
