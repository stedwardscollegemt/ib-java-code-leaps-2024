package topicDlearningaids.crashcourse;

import java.util.Date;

public class Passenger {
    
    private String idNumber;

    private String fullName;

    private Date dateOfBirth;

    TransportCard card;

    /**
     * Define constructor: 
     * A special type of method that is used to create instances of a class using the new keyword.
     * By default constructors are empty, but it is common to define constructors
     * that accept values to instantiate a class with initial values.
     */
    public Passenger(String idNumber, String fullName, Date dateOfBirth) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.card = new TransportCard();
    }

    /** Accessor methods */
    // Define signature: 
    // All methods have a unique signature. The signature is made up of the name and the set of parameters it accepts.
    public String getFullName() {
        /**
         * Define return:
         * This is a special statement that allows a method to give back a particular value. 
         */
        return fullName;
    }
}