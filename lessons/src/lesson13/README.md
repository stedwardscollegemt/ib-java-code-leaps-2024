# Polymorphism

This is an OOP feature which is closely related to *inheritance*. From the same parent object (super class) we can have multiple children that share all the attributes/methods of the parent (so can be treated as such) but at the same time take a different shape (if need be) by adding more . 

## Method Signature

The method signature is composed of:

- A name with a unique set of parameters
- The return type (very recent change in IB). Many developers do not agree with this because you cannot have:

```java
public String myName() {
        return "Erika";
    }

public void myName() {
    
}
```

### Method Overloading

We can use the same method name but have a different set of parameters. 

### Method Overriding

This is a Java feature related to polymorphism. When an object inherits behaviour from the parent, since the child object takes a different shape, then some logic must be enhanced e.g., the `getPrice()` of the MainMeal. For this reason, we can use `@Override` which allows us to use the same *method signature* for different logic. You must inherit from a class to use this overriding feature.
