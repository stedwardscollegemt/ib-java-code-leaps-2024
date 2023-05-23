package topicDlearningaids.simon;

import java.util.Date;

/**
 * D.1.8 Construct related objects for a given problem
 * D.2.1 + D.3.3 Encapsulation: public, protected, private
 */
public class Student {
    /**
     * --- Attributes --------------------------
     */
    private String name;

    private String surname;

    private Date dob;

    public int year;

    /**
     * --- Constructor --------------------------
     */
    public Student(String name, String surname, Date dob) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    /**
     * --- Behaviour --------------------------
     */
}
