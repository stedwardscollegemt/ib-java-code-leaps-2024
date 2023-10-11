# Paper 2 November 2018 SL

## Question 11

11 

a. 

```
public SalesPerson(String id)
{
    this.id = id;
    this.salesHistory = new Sales[100];
    this.count = 0;
}

public SalesPerson(String id, Sales[] s, int c)
{
    this.id = id; // this is referring to the instance, id is the param value passed
    this.salesHistory = s;
    this.count = c;
}
```

b. In Java, `private`, `public` and `protected` are accessor modifiers which developers use for *encapsulating* the data. When attributes are `private` they cannot be accessed *outside the class*. To give "read access" the developer must provide *public accessor methods* e.g., `public int getCount()` and `public String getId()`. 

c. i. `SalesPerson` *has many* `Sales`

```
---------------------                    --------------------- 
|                   |                    |                   |
|       Sales       |------------------<>|    SalesPerson    |
|                   |                    |                   | 
---------------------                    ---------------------
|   <attributes>    |
|                   |
|                   |
|                   |
---------------------
|     <methods>     |
|                   |
|                   |
|                   |
---------------------

Note : I want to show "aggregation"/diamond in UML
```

c. ii. Let us imagine that we are renaming a method in the `Sales` object e.g., `getValue()`. This method is probably being used *outside of the class* so we would need to make sure to change the code that used to reference this method. These kind of activities are difficult and can result in bugs.