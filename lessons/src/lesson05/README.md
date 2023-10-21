# Methods

A method is a block of code that is run every time it is called.

## IB Learning Outcomes

- 4.1.1. Able to identify a suitable procedure in an attempt to solve a very simple problem.
- 4.1.2 Able to evaluate whether the order of steps makes a difference.
- 4.1.3 Able to explain the role of sub procedures in solving a large problem.

## Introduction 

We have already started defining methods to be quite frank with you, you just did not know it (sorry).
Every time we create a new file in Java, you always defined the  `main()` which is a very special method because it defines the main entry point of your program. We can specify other methods that can act like neat drawers to store our code, so that we can "open" them and "close" them whenever we deem it is necessary.

## A closer look at the main()

```
public static void main(String[] args) {
    // code written during the lesson
}
```
<b>The Anatomy of a Method:</b>

- <b>Header:</b> the first four words followed by parenthesis
- <b>Body:</b> the two curly brackets and its contents

## Keyboard.readInt()

We have also been relying on methods written for us in the `Keyboard` class. In the example below we are calling `readInt()` which resides in the `Keyboard` class. It contains code that can accept user input and convert it into an integer.

```
int age = Keyboard.readInt();
```

## A custom method()

Here is an example of a custom method, which is not the `main()` inside a class called `MathPal`. Look at the method `add`.

```
public class MathPal {
    
    public static void main(String[] args) {
        // code to call method add here
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
```

To make use of methods, you can *call* it in another place in your code.

```
public class MathPal {
    public static void main(String[] args) {
        // this is a method call
        int result = add(5, 2);
        System.out.println("Result: " + result);
    }
}
```
## Methods Check List

As we create some methods I will be showing you a few things that we can do:

- Method names that make sense and proper convention
- Method without parameters e.g. ``cleanTerrace()``
- Method with parameters e.g. ``add``
- Method that does not give back a value, we say it is *void* e.g. ``cleanTerrace()``
- Method that does give back a value, we say it *returns* something e.g. ``add``
- Method overloading, how Java can allow multiple methods with the same name e.g. ``add`` but with `double` instead of `int`

# Treating Programming Like Lego

You are probably thinking that so far programming seems over simplified - yes you are right.
Building complex solutions is probably the most challenging part of programming. 
People start out just looking into the individual blocks of programming without really seeing the big picture. 
Doing that is like playing with only two lego blocks at a time and stopping there. It gets boring and pointless very quickly.

From now on, we are going to treat programming like lego so that you will realise that you can do very powerful things much like the amazing things we see people do with colourful lego blocks.

<img src="https://www.mcall.com/resizer/QHj14zlBsb5htPiusxUBKKVWmU0=/1200x0/top/arc-anglerfish-arc2-prod-tronc.s3.amazonaws.com/public/FNSKMUUPBRE6NMEFOFRNFGP3PI.jpg" width="auto" height="300"/>

We finally have enough to just get started. Yes we will meet cool new blocks along the way. Just from now on we will always be solving *real* problems. Buckle up and get your math on because you are in for a ride!
