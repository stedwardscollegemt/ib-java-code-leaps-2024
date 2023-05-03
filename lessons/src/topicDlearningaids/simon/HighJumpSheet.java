package topicDlearningaids.simon;

public class HighJumpSheet {
     /**
     * --- Attributes --------------------------
     */
    // static members
    final static String[] AGE_GROUPS = {"U12", "U13", "U14"};
    
    Student[] participants; // students participating

    double[] results; // heights of the participating students

    /**
     * --- Constructor --------------------------
     */

    /**
     * --- Behaviour --------------------------
     */
    public void storeResult(Student student, double result) {
        // perform a linear search to find the student in the array and get its position index

        // replace the value of the corresponding index in heights

        tallyResults();
    }

    public void tallyResults() {
        // perform a bubble on the results (and at the same time the participants)
    }

    public Student calculateStudentWinner() {
        tallyResults();
        return participants[0];
    }

    public House calculateHouseWinner() {
        return null;
    }
}
