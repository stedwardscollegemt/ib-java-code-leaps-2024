# 15 Java Collections Framework

*Summarised from page 427 Java In Two Semesters:*

Arrays are great, but:
- We need to set a size
- We need to stay building useful helper methods on Arrays

What if we do not want to set a size? If we overestimate we are wasting memory, if we underestimate we are in an awkward position. We need something more flexible or *dynamic*. We need an object that behaves like a `Collection` in Java.

It needs a lot of scaffolding, but it can be done by simply using objects and implementing relationships between them. 

# IB Learning Outcomes

- D.4.5 Define the term object reference
- D.4.7 Identify the features of the (ADT) list
- D.4.10 Construct list algorithms using object references
- D.4.11 Construct list algorithms using standard Java collections

## What is an object reference?

> An object reference is when an object points to a memory location of another object. 

And now we explain the answer.

OOP is a powerful paradigm because we can define data types that describe what is out there and have our programs describe relationships in a way that is natural. 

For example:

An `AnimalCollection` *has 0 or many* of `Animal`.

<img src="https://raw.githubusercontent.com/stedwardscollegemt/ib-java-code-leaps-2024/5f97b066d825103fc3fef5ee67365a8f38a3f513/lessons/img/animalcol.drawio.svg">

```
public class AnimalCollection {
    
    private Animal headAnimal; // reference to Animal object

    private Animal currentAnimal; // another reference to Animal object

    public AnimalCollection(Animal headAnimal) {
        this.headAnimal = headAnimal;
        this.currentAnimal = headAnimal;
    }
    
    // ... more code ...

}
```

Let us think about the implications:
1. An object instance takes up memory space.
2. An object can be related to **many** other objects (remember `Appointment.java`).
3. RAM is not organised like an array it is MESSY (like our sock drawer).

Java does not want the "pressure" of finding a contiguous piece of memory to fit your complex object. We programmers do not want that either. So what does Java do? Take a look at our code:

```
Animal myHeadAnimal = new Animal("Maltese Dog", "Malta");
AnimalCollection myAnimalCol = new AnimalCollection(myHeadAnimal);
```

We wrote `new` twice! The objects `myHeadAnimal` and `myAnimalCol` <u>do not need to be physically located next to eachother</u> in RAM. But! When we pass in `myHeadAnimal` into the `AnimalCollection` constructor we passed in a *reference to is memory location* which in short is *pointer*. 

<img style="width:60%" src="https://github.com/stedwardscollegemt/ib-java-code-leaps-2024/blob/main/lessons/img/object_references.png?raw=true"/>

This is not really an invention by Java, Java's grandfather is C and pointer management is a big deal in C so Java shares this trait in this small way.

> An object reference is when an object points to a memory location of another object. For example, `AnimalCollection` needs information about the memory location of and `Animal` instance which is the head of the collection.

## Our AnimalCollection behaves-like any other Collection