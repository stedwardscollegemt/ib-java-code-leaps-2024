# Implementing Classes

OOP is still a very relevant paradigm in business (or real-world) applications. We tend to analyse real-world scenarios or objects with varying complexity e.g., a calculator, a school, a shop, a board game etc... The objects we create are a mere abstraction of what exists in the real world but the ability to remove the noise and model a complex entity into its most bare form is what makes the OOP paradigm so powerful. 

The moment OOP becomes complex... it sucks!

# IB Learning Outcomes

- D.1.3 Construct Unified Modelling Language (UML) diagrams to represent object designs.
- D.1.4 Interpret UML diagrams.
- D.1.5 Describe the process of decomposition into several objects.
- D.1.6 Describe the relationships between objects of a given problem.
- D.1.7 Outline the need to reduce dependencies between objects in a given problem (SOLID).
- D.1.10 Describe how data items can be passed to and from actions as parameters.
- D.2.1, 4 Define the term Encapsulation and Outline Advantages
- D.2.2, 5 Define the term Inheritance and Outline Advantages
- D.3.3 Define the terms: private, protected, public, static.

# Advantages and Disadvantages of OOP

Many text books and educational organizations think of this way, deconstructing something in terms of pros and cons, and naturally try to apply it to OOP. In all honesty, from a developer's point of view it really does not work that way. When you look at pros and cons and try to weigh them it normally means you have a choice. 

OOP is not a clear choice that you can easily back away from. It is almost like saying "the advantages and disadvantages of eating a potatoe". If you want to build generic solutions quickly for real-world business scenarios using the best programming frameworks out there - then you are going to exercise some flavour of the OOP paradigm. Here are some examples:

- Python's Django was not intended to be OOP and does not implement it in its purest form, but once you learn the discipline of OOP, the framework is so much easier to learn. 
- Pytorch by Facebook is a framework that allows developers to leverage high performance hardware for the purpose of deep learning and it is designed around OOP principles.
- Ruby on Rails used by Twitter is OOP in its purest form to build high performance web applications.
- Java Spring. OOP is synonymous with Java being the founder programming language of the paradigm.
- PHP Laravel is a very neat framework to build APIs using the OOP paradigm. 

So what?

I will put it this way:

There is a good way to use OOP i.e., using SOLID principles gives you a lot of advantages, and a bad way of using OOP i.e., becomes too complex too quickly and hence a headache to maintain or work within a development team.

Same like eating a potatoe, bake it with the skin on and get all the nutritional value, yes it takes longer than deep frying it and perhaps less fun and funky, but deep frying it is simply not the best way to consume all the goodness the humble potatoe has to offer.

> When using OOP apply SOLID principles to gain all of the advantages. If you choose to use OOP and ignore the principles then prepare yourself for a lot of headaches.

# UML to design SOLID OOP

## What is UML?

A standard visual way of representing the architecture of a software system that makes use of the OOP paradigm. It is not dependant on knowing a single programming language. It concisely and accurately illustrates the relationships and dependencies between modules of a system. The best way of learning SOLID OOP is by interpreting *well* designed UML diagrams. From a UML, it is then very easy to translate it to object-oriented code. Writing SOLID code cold turkey is very difficult to do and it is not recommended.

If you are in a programming team that all know UML then you could use this as a tool for technical and architecture discussions (although from my experience very few are proficient since it is so vast).

## 8.2 Designing Classes using UML Notation

We already <b>outlined the nature of an object instance</b> as follows:
- Unique Memory Reference
- State through attributes/member variables
- Behaviour through actions/member methods

Although a UML diagram is simply a drawing therefore it does not really represent one particular instance but it does define the nature of an object class/template which <b>does not quite have a unique memory reference</b>. So in the UML you include the <b>state</b> definition and the <b>behaviour signatures</b>.

## 8.3 Implementing Classes in Java

### OOP Features. Four Pillars: Abstraction, Encapsulation, Inheritence and Polymorphism

<ins>Abstraction</ins>

The *thinking abstractly* aspect of computational thinking (link to Topic 4) is one of the main pillars of this paradigm. In the early days we explained that we design object templates (classes) to only contain <b>the most significant characteristics</b> of real-world entities. It is true that a `Soldier` (in lesson 7) instance in the complex game would probably have a "look" and a "personality" but that kind of complexity is eliminated because at the time those details did not seem relevant to the solution we were desinging.

<b>SOLID Relevance: Single Responsibility, Open-closed, Liskov Substitution Principle.</b>
<b>SOLID Advantages: Manages complexity; easily reused; makes code more secure.</b>

<ins>Encapsulation</ins>

After you successfully used <b>Abstraction</b>, always using SOLID principles as a very good guideline, then as a developer you can configure the way the object can be used. You have full control of what should be allowed and not allowed with the object. We can choose to <b>hide</b> or <b>contain</b> complexity within that class. 

For example, if we created a `Student` class (keeping in mind S, O and L) does it make sense to be able to modify the...
- `name`
- `dateOfBirth`?

Probably not. Yes, we want to be able to offer the possibility of instansiating a `Student` with a particular `name` or `dateOfBirth` but then, once the state is set giving the possibility to change them can have grave repurcussions. Therefore, we would want to <b>hide that information</b>, allow *read access*, but, severely limit the possibility of *write access* to the `Student` class only.

We control this by making use of *access modifiers* in Java: `public`, `private` and `protected`.

| **Access Modifier** | UML Symbol | Meaning |
|---|---|---|
|`public`| + | Members tagged as such are visible to all other classes, therefore they can be accessed. |
|`private`| - | Members tagged as such are hidden to all other classes, therefore they cannot be accessed by them, and they can only be used within their class. |
|`protected`| # | Members tagged as such are accessible to classes within the same package/folder OR to classes that have the "is-a" relationship. More on this in lesson 09. |

So for the case of our `Student` we want to set `name` and `dateOfBirth` as `private` but give read access by providing `public` <b>accessor methods</b> that simple `return` the value of the attributes. 

```
public class Student {
    
    private String name;
    private Date dateOfBirth;

    public Student(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    // Give read access only
    public String getName() {
        return this.name;
    }

    public Date getDateOfBirth() {
        return this.dateOfBirth;
    }
}
```
<b>SOLID Relevance: Interface Segregation.</b>
<b>SOLID Advantages: Manages complexity; easily reused; makes code more secure; design and use an object within a contract of behaviour.</b>

## 8.4 The static Keyword

## 8.7 Passing Objects as Parameters



