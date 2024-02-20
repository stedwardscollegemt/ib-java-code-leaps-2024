# Polymorphism

This is an OOP feature which is closely related to *inheritance*. From the same parent object (super class) we can have multiple children that share all the attributes/methods of the parent (so can be treated as such) but at the same time take a different shape (if need be) by adding specific attributes and modifying certain behaviour. 

Polymorphism is highly encouraged and we normally implement it by making the super class describe a *contract of behaviour* which we normally refer to as an *interface* (but for some reason this detail is not in the IB syllabus). Child classes are free to implement the contract in any way that makes sense. We call this *method overriding*. 

Java is purely object-oriented, so even when you are not explicitly making use of object-oriented techniques, you may still be using this feature without knowing. One example I can think of is *overloading* whereby a *method name* or *operator* can be used in multiple ways. The simplest and most famous example of overlading is the `+` operator which we can in two ways:
- To perform math arithmetic e.g., `int points = 2 + 3; // points is 5`
- To join Strings and variables to patch text e.g., `System.out.println("Points awarded: " + points);`

# IB Learning Outcomes
- D.2.3 Define the term polymorphism.
- D.2.6 Explain the advantages of polymorphism.
- D.2.10 Explain the advantages of modularity in program development.

## Method Signature

For the Java programming language, the <b>method signature</b> is composed of:

- A method name with a unique set of parameters.

> **Warning**
> Recently, IB made a slight change in their MS to *award one mark* when the student mentions the `return` type. However, *many developers* do not agree with this. Unfortunately this depends on the language syntax.

In Java, the return type cannot be considered as part of the method signature because the example below is impossible:

```java
/**
 * Try this out, the code will not compile. It breaks a rule in Java.
 */

public String myName() {
    return "My name is Erika.";
}

public void myName() {
    System.out.println("My name is Erika");
}
```

### Method Overloading

We can use the same method name but have a different set of parameters. This is most commonly done to *overload* constructors. In the example below, notice how we use the same label/name `SideItem` but with different sets of parameters. 

```java
public class SideItem extends FoodItem {
    
    // Allow our customers order fries without salt
    String comment;

    /**
     * Example of an overloaded constructor
     * @param code
     * @param price
     */
    public SideItem(String code, double price) {
        super(code, price);
        this.comment = "";
    }

    /**
     * Example of an overloaded constructor
     * @param code
     * @param price
     * @param comment
     */
    public SideItem(String code, double price, String comment) {
        super(code, price);
        this.comment = comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
```

It is less common, but possible to *overload behaviour methods*. Just remember, to overload (reuse) the same name/label and pass in a unique set of parameters.

### Method Overriding

This is a Java feature related to polymorphism. When an object inherits behaviour from the parent, since the child object takes a different shape, then some logic must be enhanced e.g., the `getPrice()` of the MainMeal. For this reason, we can use `@Override` which allows us to use the same *method signature* for different logic. You must inherit from a class to use this overriding feature.

```java
public class MainMeal extends FoodItem {
    
    final double PRICE_MARKUP = 0.26;

    Sandwich sandwich;

    DrinkItem drink;

    public MainMeal(Sandwich sandwich) {
        super(sandwich.code, sandwich.price);
        this.drink = new DrinkItem("Coca Cola");
    }

    @Override
    public double getPrice() {
        this.price = this.sandwich.price + (this.sandwich.price * PRICE_MARKUP);
        return this.price;
    }
}
```

This feature has a lot of advantages, for one, even though a lot of code is reused, the developer is still free to make tweaks to the logic as needed.

# May 2017 Paper 2 Question 14 (i)

<b>Q: Discuss the use of polymorphism that occurs in this suite of programs.</b>

Step 1.

<u>Identify a case of polymorphism (overriding/overloading).</u>

In this case, we can identify *method overloading* because we have two constructors using the same name, but different sets of parameters.

```java
//constructor for a new salesperson
public SalesPerson(String id)
{
    // code missing
}

// constructor for a salesperson transferred (together with
// their sales details) from another branch
public SalesPerson(String id, Sales[] s, int c)
{
    // code missing
}
```

Step 2. 

<u>An advantage and disadvantage</u>

An advantage is that a developer can choose to create an instance of `SalesPerson` in two ways. The developer can either just pass in the `String id` and have default values for the rest of the attributes, or else, the developer passes in the `String id`, the `Sales[] s` and the `int c`. 

Of course, this makes code more complex, and developers must make sure to use OOP features in such a way that SOLID principles are obeyed. Having the same name, with different sets of parameters implies that we have two responsibilities. So unfortunately this breaks the "single responsibility" principle. 

Step 3. 

<u>A conclusion</u>

Polymorphism is very useful, it encourages *modularity*, and developers are encouraged to create small modules which can be extended/inherited from and tweak logic as necessary. This is called *overriding*. 








