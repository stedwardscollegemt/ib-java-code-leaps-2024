# Option D - Object-Oriented Programming

## Glossary

| **Term** | Meaning |
|---|---|
| **Attribute** | A characteristic of an object defined in the class e.g. in a class called `Person` a property can be `eyeColour`. |
| **Class** | A code file which acts as the blueprint, or cookie cutter, of an object by specifying the properties (characteristics) that and methods (behaviour). |
| **Constructor** | The special method that is invoked using the `new` keyword when creating an *instance* of a *class*. Must share the same name of the class. |
| **Instance** | The variable that stores a single object in memory that retains the state during a program's lifetime. This is created using the `new` keyword e.g. `Soldier jack = new Soldier();`. In this case `jack` is an instance of `Soldier`. |
| **Members** | The *attributes* and *methods* of a class. |
| **Method** | The code that defines behaviour of a class normally contains a verb like `changeWeapon()` or `respawn()`. |
| **Object-Oriented Programming (OOP)** | An approach to designing and building applications that are flexible, natural, well-crafted, and testable by focusing on objects that interact cleanly with one another. This SOLID approach summarises the principles of this paradigm. |
| **Static** | A member of a class that is not tied to a particular instance because it does not describe a state or define a behaviour. Static values and methods can be accessed through the class name.

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