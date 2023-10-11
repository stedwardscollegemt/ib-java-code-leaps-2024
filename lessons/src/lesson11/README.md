# Case Study Part 1

There is nothing wrong with programming as a hobby but for "the business" developers need ruthless discipline and most software houses adopt a software development methodology or in more student friendly terms *System Development Lifecycle* e.g., Agile. No matter what software methodology you adopt the following stages seem to be common:

- Analysis and Specification
- Design
- Coding
- Testing
- Implementation (Change Management)
- Support/Maintenance

As you know, in IB, you will demonstrate this process by developing a solution of a real problem for a real client whereby each Criterion loosely maps to a particular stage in the SDLC. We do Miro workshops in class to really talk about the stages in detail. What I will bring to the forefront in this lesson is <b>testing</b>. Saying that testing is important is an understatement. Let me share with you my rule of thumb...

> Usability testing is a must to ship a feature. You build a feature, but no test... do not put into production, period.

# IB Learning Outcomes

- 1.1.1 Identify the context of which a new system is planned.
- 1.1.7 Suggest various types of testing.
- D.3.10 Discuss the ethical and moral obligations of programmers.

# Mini SDLC

## Simple Requirement

Do you remember this small program from `lesson02`? The requirement (or success criteria) is simple here:

> The user wants to insert the number of cups of flour and the system will output the equivalent in grams

```
public class FlourCupsGramsConvert {
    
    public static void main(String[] args) {
        
        // FLOUR_DENSITY = 0.762
        final double FLOUR_DENSITY = 0.762;
        
        // COEFFICIENT = 236.588
        final double COEFFICIENT = 236.588;

        // Input
        System.out.println("Please enter the number of cups to convert:");
        int numberOfCups = Keyboard.readInt();

        // Process
        double flourInGrams = numberOfCups * COEFFICIENT * FLOUR_DENSITY;

        // Output
        System.out.println("Flour in grams: " + flourInGrams);
    }
}
```

## Design

Whilst there is nothing wrong with our program, it does not really make use of <b>SOLID</b>. We have grown since the second lesson, we want to think ahead, we want to add value for our users. Therefore we need to make sure our program is <b>testable</b> and <b>extendable</b>. It is our obligation as developers to do so. The previous solution is none of these things so we need a *refactor* (all developers in the world shudder).

Not to worry, I got your back this time round!

<img src="https://github.com/stedwardscollegemt/ib-java-code-leaps-2024/blob/main/lessons/img/solid_flourcupgramconverter.PNG?raw=true"/>

## Coding for Automated Tests

Aside from using the software as though as user would... testing a main() is a bit awkward. Once we have the important stuff in a module then we can write an automated test *ding* advantage of "modularity" right there.

Let us level up:

```
public class FlourCupsGramsConvert {
    
    private final double FLOUR_DENSITY = 0.762;
    private final double COEFFICIENT = 236.588;

    private int numberOfCups;

    public FlourCupsGramsConvert(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public double getNumberOfCups() {
        return this.numberOfCups;
    }

    public double getGrams() {
        return numberOfCups * COEFFICIENT * FLOUR_DENSITY;
    }
}

public class DemoConvert {
    
    public static void main(String[] args) {
        // controller code (user input, module process, user output)
    }
}
```

### Writing our first Unit Test

Writing unit tests is a common practice adopted by developers to test small pieces of code that can be logically isolated. They are simple to write and often the process is repetitive. 

The ingredients of a unit test:
- Set Up for e.g., initialise the module you are isolating
- Tear Down for e.g., clearing keys/cache (not needed in our simple program)
- Logical scenarios for testing e.g., a happy path and an unhappy path
- Hard code test data to predict a result, and compare it with the actual

Example:

```
public class FlourCupsGramsConvertTest {

    private FlourCupsGramsConvert mock;

    public void runTestSuite() {
        this.testConversionHappyPath();
    }
    
    private void setUp() {
        this.mock = new FlourCupsGramsConvert(3);
    }

    private void tearDown() {
        // we did not need this, but it is here anyway because standards
    }

    // Unit tests
    private void testConversionHappyPath() {
        setUp();
        
        double expected = 10;
        double actual = mock.getGrams();

        if (actual == expected) {
            System.out.println("P ");
        } else {
            System.out.println("F ");
        }

        tearDown(); // does nothing, not hurting anyone
    }
}
```

To run the tests, run `RunAllUnitTests.java` that has the `main()`. 




