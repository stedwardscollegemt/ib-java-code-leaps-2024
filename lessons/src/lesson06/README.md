# Arrays

An array is a data structure enables us to organise data of a *similar* nature (same data type) so that our algorithms can be flexible and efficient. An array is a contiguous block of memory, of a pre-determined size, that can store a *collection* of data of the *same* data type.

![](https://qph.fs.quoracdn.net/main-qimg-6dcb98b78005a9af064fc4f0e8fbc19e)

Every piece of data in an array is often referred to as an *element*.

## 6.2 Creating an array

Declaring an array in Java is not much different to declaring a single variable, there is just one slight difference to indicate that there will be "many" of the stated type.

Recall declaring a single integer:
`int point;`

Declaring an array of integers to store multiple points:
`int[] points;`

You can declare an array to store data of any single type in Java:
`double[] temperatures;`

`char[] letters;`

`String[] tweets;`

In order to initialise our array (store actual values) we first need to *allocate* memory. We must commit and reserve a definite size of contiguous memory, and we can do that by stating how many variables we intend to store. 

Arrays in Java are *complex* types therefore we initialise complex types using the `new` keyword.

`points = int[10]; // intend to store 10 numbers representing points`

Similarly...

`temperatures = double[15]; // intend to store 15 decimal numbers`

## 6.3 Access array elements

How do we get a specific value? Every element in an array is labelled with a unique index indicating its position in the array. The index is a number, and the first position is always indexed at 0.

So to access the first element in an array...
`int firstPoint = points[0];`

Naturally we can get the second element by...
`int secondPoint = points[1];`

To get the last point:
`int lastPoint = points[9];`

The last index is always going to be the size minus one.

Using the same logic we can update specific array locations with values:

```
points[0] = 9;
points[1] = 4;

// We can even do this
int awardedByMalta = 12;
points[0] = awardedByMalta; // assigning a value through a variable

// We can also do this...
points[4] = 2 * awardedByMalta; // assigning an expression

// This is ok also...
Scanner sc = new Scanner(System.in);

points[1] = sc.nextInt(); // storing user input in an array location

sc.close();
```
Basically, you can treat a single array element as you would any other variable!

```
if (points[0] > points[1]) {
    int temp = points[0];
    // swap positions
    points[0] = points[1];
    points[1] = temp;
}
```

What happens when you try and do something like `points[50] = 2;`? You get an error which we usually refer to as an *Exception* (more details next lesson).

Try it out for yourself and see if you get an `ArrayIndexOutOfBoundsException`. 

## 6.7 For Loop and Arrays

We have recently done `while` loops in Java, but there is another kind of loop in particular that is really useful with arrays. Since arrays are of a *fixed size* then they are are naturally pairing with `for` loops, which loops code for a definite number of times.

```
for (int i = 0; i < 10; i++) { // i will go up in steps of 1 from 0 to 9
    System.out.println(points[i]);
}

```
It is important that you start iterating/counting (we tend to use *i* because it means iteration, go figure) from 0.

If you do not really care about the position of the elements then you can use a *special* for loop provided by Java just to get each and every element in an array.

```
// for each element which we named p in points
for (int p : points) {
    System.out.println(p);
}
```

The above can come in very handy in the future.

### The Array.length property

Instead of remembering the size of the array you can use the array property `.length` on any array variable e.g.:

```
points.length; // gives you 10
temperatures.length; // gives you 15
```

## 6.4, 6.6 Passing arrays to methods and returning them

We recently learned about methods allowing us to write programs into "blocks" or "drawers" of logic. 

Methods can receive whole arrays as a parameter (input).


And can also return an entire array (output).


In both cases take note of the method signatures.

## 6.8 Some useful array methods 