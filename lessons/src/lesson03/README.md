# Selection

## IB Learning Outcomes
- 4.3.8 Define <, >, <=, >=, ==, !=
- 4.3.9 Construct algorithms that make use of branching

## 3.2 Making Choices

We want to write useful programs to express algorithms that can solve our problems. So far, we have simply written instructions that are executed one after the other. However, solving complex problems requires an element of **decision making** so naturally we want that to feature in so our programs. This implies that the execution of a program can take one course or another depending on what we are doing. For instance, if we are assembling a burger perhaps we can *decide whether or not to include the current ingredient* in the assembly in order to cater for allergies. 

> A program that just executes instructions in sequence will behave in the same way. A program that can make choices can behave slightly differently each time it is run. 

We will look into a number of ways how we can incorporate decision making in our Java programs:

- An `if` statement
- An `if ... else` statement
- A nested `if` statement
- A `switch` statement  

## 3.3 The IF statement

```
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
}
```

## 3.4 The IF ... ELSE statement

```
if (/* boolean logic goes here (hello again topic 2) */) {
    // instruction(s) that only get invoked when true
} else {
    // instruction(s) that only get invoked when false
}
```

## 3.3.1, 3.5 Relational Comparisons & Boolean Logic Operators

We normally want the program to make decisions based on a combination of:

<ins>Arithmetic Comparison</ins>

- Equality `==`
- Less Than `<`
- Greater Than `>`
- Greater Than or Equal To `>=`
- Less Than or Equal To `<=`

<ins>Boolean Logic</ins>

- AND `&&`
- OR `||`
- NOT `!`