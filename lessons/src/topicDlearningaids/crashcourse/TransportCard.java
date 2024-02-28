package topicDlearningaids.crashcourse;

/**
 * Define class:
 * A class is simple a Java file which acts as a blueprint for an object. 
 * A class defines the state (member variables) and 
 * behaviour (member methods) the custom type should have.
 */
public class TransportCard {

    // ---- State [Member Variables] ----------------------------------------------------------------------------------
    // Define identifier: it is a unique label we give to important elements in our programs e.g., class name, variable name and method names.
    private double balance = 0;

    // Define primitive: referring to built-in types in Java e.g. int, boolean, double, float
    private int id;

    private String color = "Green";

    private boolean journeyActivated = false;

    private String start;

    private String stop;

    // ---- Behaviour [Member Methods] ---------------------------------------------------------------------------------
    // Define parameter: Methods in Java are normal algorithms that accept input elements as parameters. 
    //                   Parameters are just variables that are created to temporarily store input values
    //                   which need to be processed within the method scope. 
    public double topup(double amount) {
        balance += amount;
        return balance;
    }
    
    // Define **local** variable: The term local refers to a scope "{}" and a variable lives and dies within that scope "{}".
    //                            Example, double balance has a *class scope*, but double freeTopup is "local" to the method premiumTopup.
    public double premiumTopup(double amount) {
        double freeTopup = 5.00;
        balance += (amount + freeTopup);
        return balance;
    }

    // Accessors
    public double getBalance() {
        return balance;
    }

    // Mutator
    public void setColor(String colorIn) {
        color = colorIn;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public void startJourney(Route route) {
        if (this.balance >= 0.5) {
            this.journeyActivated = true;
            this.start = route.getCurrentStop();
        } else {
            System.out.println("Error, Please top-up before you get on a bus!");
        }
    }

    public void endJourney(Route route) {
        double fair = route.calculateFair(start, route.getCurrentStop());
        this.balance = balance - fair;
        this.journeyActivated = false;
    }
}


