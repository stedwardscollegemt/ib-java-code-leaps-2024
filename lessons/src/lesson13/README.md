# Polymorphism

This is an OOP feature which is closely related to *inheritance*. From the same parent object (super class) we can have multiple children that share all the attributes/methods of the parent (so can be treated as such) but at the same time take a different shape (if need be) by adding specific attributes and modifying certain behaviour. 

Polymorphism is highly encouraged and we normally implement it by making the super class describe a *contract of behaviour* which we normally refer to as an *interface* (but for some reason this detail is not in the IB syllabus). Child classes are free to implement the contract in any way that makes sense. We call this *method overriding*. 

Java is purely object-oriented, so even when you are not explicitly making use of object-oriented techniques, you may still be using this feature without knowing. One example I can think of is *overloading* whereby a *method name* or *operator* can be used in multiple ways. The simplest and most famous example of overlading is the `+` operator which we can in two ways:
- To perform math arithmetic e.g., `int points = 2 + 3; // points is 5`
- To join Strings and variables to patch text e.g., `System.out.println("Points awarded: " + points);`

# IB Learning Outcomes

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

We can use the same method name but have a different set of parameters. 

### Method Overriding

This is a Java feature related to polymorphism. When an object inherits behaviour from the parent, since the child object takes a different shape, then some logic must be enhanced e.g., the `getPrice()` of the MainMeal. For this reason, we can use `@Override` which allows us to use the same *method signature* for different logic. You must inherit from a class to use this overriding feature.
