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

<div class="mxgraph" style="max-width:100%;border:1px solid transparent;" data-mxgraph="{&quot;highlight&quot;:&quot;#0000ff&quot;,&quot;nav&quot;:true,&quot;resize&quot;:true,&quot;toolbar&quot;:&quot;zoom layers tags lightbox&quot;,&quot;edit&quot;:&quot;_blank&quot;,&quot;xml&quot;:&quot;&lt;mxfile&gt;&lt;diagram id=\&quot;d_rElhsFhSv6LNfIZEUG\&quot; name=\&quot;Page-1\&quot;&gt;&lt;mxGraphModel dx=\&quot;383\&quot; dy=\&quot;324\&quot; grid=\&quot;1\&quot; gridSize=\&quot;10\&quot; guides=\&quot;1\&quot; tooltips=\&quot;1\&quot; connect=\&quot;1\&quot; arrows=\&quot;1\&quot; fold=\&quot;1\&quot; page=\&quot;1\&quot; pageScale=\&quot;1\&quot; pageWidth=\&quot;827\&quot; pageHeight=\&quot;1169\&quot; math=\&quot;0\&quot; shadow=\&quot;0\&quot;&gt;&lt;root&gt;&lt;mxCell id=\&quot;0\&quot;/&gt;&lt;mxCell id=\&quot;1\&quot; parent=\&quot;0\&quot;/&gt;&lt;mxCell id=\&quot;3\&quot; style=\&quot;edgeStyle=none;html=1;exitX=1;exitY=0.5;exitDx=0;exitDy=0;endArrow=none;endFill=0;\&quot; edge=\&quot;1\&quot; parent=\&quot;1\&quot; source=\&quot;2\&quot;&gt;&lt;mxGeometry relative=\&quot;1\&quot; as=\&quot;geometry\&quot;&gt;&lt;mxPoint x=\&quot;230\&quot; y=\&quot;145\&quot; as=\&quot;targetPoint\&quot;/&gt;&lt;/mxGeometry&gt;&lt;/mxCell&gt;&lt;mxCell id=\&quot;5\&quot; value=\&quot;has\&quot; style=\&quot;edgeLabel;html=1;align=center;verticalAlign=middle;resizable=0;points=[];\&quot; vertex=\&quot;1\&quot; connectable=\&quot;0\&quot; parent=\&quot;3\&quot;&gt;&lt;mxGeometry x=\&quot;-0.211\&quot; y=\&quot;-1\&quot; relative=\&quot;1\&quot; as=\&quot;geometry\&quot;&gt;&lt;mxPoint x=\&quot;11\&quot; y=\&quot;-16\&quot; as=\&quot;offset\&quot;/&gt;&lt;/mxGeometry&gt;&lt;/mxCell&gt;&lt;mxCell id=\&quot;2\&quot; value=\&quot;AnimalCollection\&quot; style=\&quot;html=1;\&quot; vertex=\&quot;1\&quot; parent=\&quot;1\&quot;&gt;&lt;mxGeometry x=\&quot;20\&quot; y=\&quot;120\&quot; width=\&quot;110\&quot; height=\&quot;50\&quot; as=\&quot;geometry\&quot;/&gt;&lt;/mxCell&gt;&lt;mxCell id=\&quot;4\&quot; value=\&quot;Animal\&quot; style=\&quot;html=1;\&quot; vertex=\&quot;1\&quot; parent=\&quot;1\&quot;&gt;&lt;mxGeometry x=\&quot;230\&quot; y=\&quot;120\&quot; width=\&quot;110\&quot; height=\&quot;50\&quot; as=\&quot;geometry\&quot;/&gt;&lt;/mxCell&gt;&lt;/root&gt;&lt;/mxGraphModel&gt;&lt;/diagram&gt;&lt;/mxfile&gt;&quot;}"></div>
<script type="text/javascript" src="https://viewer.diagrams.net/js/viewer-static.min.js"></script>

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