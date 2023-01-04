# Building Blocks

## IB Learning Outcomes
- D.1.9 Explain the need for different data types to represent data items
- 4.3.6 Define: variable, constant, operator, object
- 4.3.7 Define operators: mod, div
- 4.3.8 Use of variables, constants and operators in algorithms
  
## 2.2 Simple Data Types in Java

We need our programs to store and manipulate data so it becomes valuable information. We are surrounded by different kinds of data, therefore Javat allows
us to easily classify various data into different types:

- `int` is short for `Integer` and can store whole numbers e.g. 1, 2, -4
- `float` is short for floating-point and can store real numbers within a specific range e.g 0.1, 0.005, 6.7
- `double` is a real number but we use the type to store numbers of a wider range than `float` e.g. 56789321.1, 3.4, 898989898989.2221 
- `char` is short for character so it stores alphanumeric symbols e.g. 'a', '&', '*'
- `boolean` stores `true` or `false` this is the smallest unit of data that can be processed by any computer because it is binary

## 2.3, 2.4 Declaration and Assignment of Variables

A *variable* is a data container that saves the data values during Java program execution in our main memory, or RAM. In Java, when declaring a variable we have to specify the data type, so that Java knows how much memory needs to reserved, and, give it a name. A declaration only occurs once within a scope defined by `{}`.

```
int points;
```

To store a value of 10 in the `points` variable we need to perform an assignment. An assignment can occur many times within a scope:

```
points = 10;
```

It is possible to do a declaration and assignment of a variable in the same statement:
```
int points = 10;
```

## 2.3, 2.5 Constants

A *constant* is a variable whose value cannot change once it has been assigned. We normally declare constants to store pieces of data that is not configurable like the number of days in a week, or the value of pi. Using constants for these special data items makes your code more readable. Declaring a constant is very similar to declaring a variable but we must use a keyword `final` at the beginning of the statement:

```
final double PI = 3.141592653589793238;
```

## 2.6 Arithmetic Operators

It is very common to need to perform some kind of arithmetic. Java has 4 familiar arithmetic operators plus a remainder operator which is formally referred to as *modulus*. Refer to the table below:

| Operation      | Java Operator |
| -------------- | ------------- |
| Addition       | +             |
| Subtraction    | -             |
| Multiplication | *             |
| Division       | /             |
| Remainder      | %             |

<b>Usage</b><br/>

```
int x;
x = 10 + 25;
```
It is always a good idea to group terms using parenthesis when expressions have multiple operators. Precendence as follows: brackets, division, multiplication, addition and subtraction (BODMAS).  

```
double cost;
cost = 500 * (1 + 17.5/100);
```

<b>The remainder operator or modulus (mod in IB)</b><br/>

Returns remainder after integer division. Some examples:

| Expression     | Result        |
| -------------- | ------------- |
| 29 % 9         | 2             |
| 6 % 8          | 6             |
| 40 % 40        | 0             |
| 10 % 2         | 0             |

<b>Division between two integers (div in IB)</b><br/>

Assume that `int totalPointsEachPlayer = totalPoints / numberOfPlayers;` equates to 250/3, it will yield a whole number, 83, and not 83.3333. This, in Java, is by design. Rather than having two separate operators for division, Java uses one and at times it returns an integer or else a real number depending on the context. In this case the division operator is said to be **overloaded**. We will learn more about this in the future, but basically it means that there is more than one behaviour tied to the same element. You might think it is confusing now, but don't worry later on you will find out that this is a good thing.

So, how will you know which behaviour will kick in? Simple, if in the expression at least one variable or value is a *real number* then the Java will assume we mean the division we are used to. 