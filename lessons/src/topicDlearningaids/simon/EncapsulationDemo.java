package topicDlearningaids.simon;

import java.util.Date;

/**
 * This is just a class with the main() to explain what "information hiding" truly means.
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        
        // todo: Create an instance of a student
        Student simon = new Student();
        simon.dob = new Date(123213);
        simon.name = "Not Simon";
    }
}
