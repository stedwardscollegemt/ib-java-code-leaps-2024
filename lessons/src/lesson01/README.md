# First Step

Welcome to your first lesson. This lesson is all about breaking the ice and gaining some level of comfort with the basics. We will mostly be following <a href="https://link.springer.com/book/10.1007/978-3-319-99420-8">Java In Two Semesters</a>. It has a lot of exercises for you to do in your own time, please make sure to find some time to practice independently. Even though we would be following a book that is not recommended by IB rest assured that anything we do in class can directly be linked to the IB curriculum. In fact, in these README files we will start with the IB learning outcomes you should walk away with after completing the lesson. I decided to expose a digital copy that you can access directly from <a href="file:///G:/My%20Drive/Public/St%20Edwards%20College%20IB%20Computer%20Science/Java%20Resources/Java%20In%20Two%20Semesters.pdf">here</a>.

## IB Learning Outcomes
- 4.3.3 Explain the essential features of a programming language.
- 4.3.4 Explain the need for high level languages.
- 4.3.5 Outline the need for translation from an HLL to machine executable code.

# 1.4 Programming in Java

## What is Java?

Java is a programming language. A programming language is a tool dictated by a strict set of rules in order to express a logical flow, termed as algorithms, that can be implemented by a computer. Since computers can only directly work with binary, or machine code, the flows we write have to go through a process of translation. Java is considered to be a High Level Language and it is still considered as one of the best languages to learn for back-end development.

# 1.7 Your First Program: Hello, world!

A program is an ordered sequence of instructions for the computer to execute. Anyone who knows anything about programming will tell you that the first program that you write a new language has always got to be a program that displays "Hello, world!" on screen; so we will stick to the tradition also, and our first program will do exactly that!

## Breaking it down

The first line (the header) looks like this:

```java
public class HelloWorld
```

and it is very important to pay attention to the word **class**. This concept is very important in Java because it is an *object-oriented language*. We will get into more detail about what this means later but for now you should understand that all the source code that we write in Java must be in a `public class` and the name of the class must match the filename.

We then move on to write more code within the {}; these tell the compiler (recall from introduction) where a class begins and ends.

As our programs become larger and more complex you can imagine that our projects will contain multiple classes therefore multiple files to keep our source code neat and organised. However, *just one* of the classes must declare the `main` method which indicates the beginning of a program.

```java
public static void main(String[] args)
```

Finally let us look at the most exciting bit. The single line of code that actually produces an output! The line below prints out text of our choice on to the console when we **run** our program. 

```java
System.out.println("Hello, world!");
```

## Adding Comments

- Single line comments e.g. `// This is a single line comment`
- Multi-line comments  e.g. `/* This can be a multi-line comment*/`

## Keep in mind

* Java is case-sensitive.
* Must declare just one main method as indicated above.
* Every statement we write in java must end with a semi-colon `;` .
* Text meant to be outputted is surrounded by double quotes `" "`.

# FAQ

**What do public and static mean?**<br/>
Those are special words in Java that mean something quite important but let us not worry about that for now. If you are programming for the very first time you have learned a lot already. As we progress we will come across them again and at that point you would be able to understand better.

**My first program is not working. What could be the problem?**<br/>
It is difficult to anticipate what problems you might have. However, when people just start out it is probably because they typed something incorrectly. Make sure to be very very careful and type out exactly what is in the code in this repository. 
<br/>
<br/>
<br/>
Want to learn more? Why not do so from [here](https://www.w3schools.com/java/default.asp)? 
