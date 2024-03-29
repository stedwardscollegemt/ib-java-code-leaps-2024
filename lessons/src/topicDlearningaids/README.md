# Option D - Object-Oriented Programming

## Glossary

| **Term** | Meaning |
|---|---|
| **Accessor** | Attributes in a class that are `private` or `protected` have restricted access but a `public` method can be written to allow programmers to get the value of to allow read access. This is standard practice. |
| **Abstraction** | An OOP feature. Refers to only including relevant data in an object to keep things simple. Very important to keep in mind S, O and L in SOLID. |
| **Attribute** | A characteristic (member variable) of an object defined in the class e.g. in a class called `Person` a property can be `eyeColour`. |
| **Class** | A code file which acts as the blueprint, or cookie cutter, of an object by specifying the properties (characteristics) that and methods (behaviour). |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. |
| **Encapsulation** | An OOP feature. Refers to the grouping of attributes and methods in a class. Very important to keep in mind S in SOLID - Single Responsibility, which IB broadly refers to as *modularity*. Access to attributes and methods can be controlled using the keywords *public*, *private* and *protected*. Most of the time developers simply summarize this as "information hiding" to strongly imply that complexity is managed (by thinking abstractly and only exposing attributes and methods that really matter). <a href="https://pianalytix.com/concept-of-encapsulation-in-java/">Remember the capsule pill analogy.</a> |
| **Instance** | The variable that stores a single object in memory that retains the state during a program's lifetime. This is created using the `new` keyword e.g. `Soldier jack = new Soldier();`. In this case `jack` is an instance of `Soldier`. |
| **Inheritence** | An OOP feature. A relationship between two classes whereby a child class "is-a" type of parent class e.g., a `Lion` class "is-a" type of `Cat` class. A child class will inherit data and actions of the parent/super class and is able to access parent traits that are `protected`. This is easy to understand and implement using the `extends` keyword e.g., `Lion extends Cat` but it is considered to be a tight dependency and such a feature should not be overused. A class can only `extend` one class! |
| **Members** | The *attributes* and *methods* of a class. |
| **Method** | The code that defines behaviour of a class normally contains a verb like `changeWeapon()` or `respawn()`. |
| **Mutator** | Attributes in a class that are `private` or `protected` have restricted access but a `public` method can be written to allow programmers to change the value of these in a controlled manner. For example, include strict rules and validation. This is standard practice. |
| **Object** | An abstract data type that normally models (thinking abstractly) a real-world object or process by describing its *state through attributes* (data) and a *set of behaviour through methods* (actions). By using the special method, the constructor, we can have instances of our models, and each instance would have a *unique reference* (memory location). |
| **Object-Oriented Programming (OOP)** | An approach to designing and building applications that are flexible, natural, well-crafted, and testable by focusing on objects that interact cleanly with one another. This SOLID approach summarises the principles of this paradigm. |
| **Polymorphism** | An OOP feature. This is more complex in reality than IB suggests, but basically it translates to "many forms". Multiple classes can *inherit* from the same class but abide by a contract of behaviour defined by its *super* slightly differently by <b>overriding</b> methods. Moreover, like C++, the same method name in Java can also take a different logical form depending on the type of parameters passed on to it. This is called <b>overloading</b>. |
| **private**| An access modifier for an attribute or method within a class that makes it accessible only within the class. For any other class in the program it is *hidden*. This is related to *encapsulation*. |
| **protected** | An access modifier for an attribute or method within a class that makes it accessible within the class, or subclasses through *inheritance*. This is related to *encapsulation*. |
| **public** | An access modifier for an attribute or method within a class that makes it accessible from any other class in the program. |
| **Relationship** | A relationship between two or more objects defines how these objects will interact or collaborate in a context of a real-world problem. Many times, the relationship tries to model the actual real-world relationship. There are four main types: "uses (one or many)", "has/made up of (one or many)", "is a" and "behaves like a". Defining too many relationships can make the solution much more complex. Therefore one must always keep in mind SOLID principles. |
| **Single Responsibility** | One of the five principles in SOLID. A module or a class should only have one reason to change and should only have one main goal to achieve. |
| **SOLID** |  A mnemonic acronym for five design principles intended to make object-oriented designs more understandable, flexible, and maintainable. The advantages of OOP are indeed meant to be those three, but it is not out of the box. It takes discipline and hard work. |
| **Static** | A member of a class that is not tied to a particular instance because it does not describe a state or define a behaviour. Static values and methods can be accessed through the class name. |
| **UML** | Unified Modelling Language. A general-purpose, i.e. not tied to a programming language, modeling language that is intended to provide a standard way to visualize the design (hint hint: IA Criterion B) of a system. |

## Exam Style Question

A university student is trying to use object-oriented techniques to try and replicate
a very popular game for learning purposes. When a player joins a game, an instance of the class `AmongUs` gets created. 

```
import java.util.Random;

public class AmongUs {

    public static final String[] WARDROBE = {
        "Red", "Blue", "Green", 
        "Pink", "Orange", "Yellow", 
        "Black", "White", "Purple", 
        "Brown", "Cyan", "Lime", 
        "Maroon", "Rose", "Banana", 
        "Gray", "Tan", "Coral"
    };

    public static final String[] ROLES = {
        "Crew", "Ghost", "Scientist", "Engineer", "Imposter",
        "Shapeshifter", "Guardian Angel"
    };

    public static int[] playerTracker = { 0, 0, 0, 0, 0, 0, 0 };

    private static boolean[] AVAILABLE_COLORS = {
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
        true, true, true,
    };

    private String color;

    private String role;

    public AmongUs(String colour, String role) {
        this.colour = colour;
        this.role = role;
    }

    private boolean isColourAvailable(String colour) {
        // ...
    }

    public void setRandmomRole() {
       Random r = new Random();
        int select = 0;
        do {
          select = r.nextInt(ROLES.length - 1); 
        } while(!isRoleAvailable(ROLES[select]));
        this.role = ROLES[select];
        playerTracker[select] = playerTracker[select] + 1;
    }

    private boolean isRoleAvailable(String role) {
        // code that returns whether a particular role is available
    }
}

```
a. Outline the general nature of an object.

Every instance of the `AmongUs` class has one `colour` from `WARDROBE` and one `role` from `ROLES`.

b. With reference to an example state the implication of the keyword `static`. 

c. With reference to an example state the implication of using the keywords `static final`. 

d. With reference to two examples explain the need of having different data types. 

The student now wants to create an instance of the `AmongUs` class for `playerTwo` that will have the `color` set to "Red" and have the `role` set to "Imposter". 

e. Provide the line of code that will instansiate the object correctly.

The student realised that a player is typically given the option to pick any available colour from `WARDROBE` but, the `role` is assigned randomly using the method `setRandomRole()`. A `color` can only be picked once. When a player is assigned a `color`, the `color` is blocked using `AVAILABLE_COLORS`. For example, if the player picked "Brown", then the corresponding element in `AVAILABLE_COLORS` is set to `false`. 

He would like to make a few changes to the class `AmongUs` to accomodate this. 

f. Explain what a *method signature* is.

g. By providing code snippets, explain what changes need to be made to the `AmongUs` class in order for an instance to be initialised with a chosen `color` but a random `role`.

h. State the purpose of the line `playerTracker[select] = playerTracker[select] + 1;` which can be found in `setRandomRole()`.

i. Construct the method `isColourAvailable` that searches a particular `colour` in `WARDROBE` and returns the corresponding value of `AVAILABLE_COLORS`.

j. With reference to an example in the `AmongUs` class, outline the advantages of using code libraries.