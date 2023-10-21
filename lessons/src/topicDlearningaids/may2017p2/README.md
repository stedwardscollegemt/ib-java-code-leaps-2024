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
| - String itemId   |
| <rest attributes> |
|                   |
|                   |
---------------------
| + double getVal() |
| <rest methods>    |
|                   |
|                   |
|                   |
---------------------

Note : I want to show "aggregation"/diamond in UML
```

c. ii. Let us imagine that we are renaming a method in the `Sales` object e.g., `getValue()`. This method is probably being used *outside of the class* so we would need to make sure to change the code that used to reference this method. These kind of activities are difficult and can result in bugs.

d. 
```
102
2
2550.40
5000.00
```

e. 

```
public double calcTotalSales() {
     // input
     double total = 0;

     // process
     for (int i = 0; i < count; i++) {
        // value of the sale at index i
        double saleValue = this.salesHistory[i].getValue() * this.salesHistory[i].getQuantity();

        // add it to the total
        total = total +  saleValue;
     }

     //output
     return total;
}
```

f. 

```
// Assuming that this is in the main method
public String highest() {
    // input
    String highestId = null;
    double highestTotal = 0;

    // process
    for (int i = 0; i < salesPeople.length; i++) {
        double totalSale = salesPeople[i].calcTotalSales()
        if (totalSale > highestTotal) {
            highestTotal = totalSale;
            highestId = salesPeople[i].getId()
        }
    }

    // output
    return highestId;
}
```

g. 

```
public void addSales(Sales s, String id) {
    for(int i = 0; i < salesPerson.length; i++) {
        if (id.equals(salesPerson[i].getId())) {
            // add the sales object s
            salesPerson[i].setSalesHistory(s);
            break;
        }
    }
}
```


