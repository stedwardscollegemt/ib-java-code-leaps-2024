package lesson08;

/**
 * Copied from May 2018 SL Paper 2
 */
public class Points {
    /**
     * ----- Attributes (Data)--------------------------------------------------------
     */
    private String memberId;  // id of the hotel customer
    
    private int totalPoints;  // this year's points 
    
    private int bonusPoints;  // any bonus points given to this year's new member 
    
    private String statusNow; // current(this year's)status
    
    private String statusNextYear; // following year's status 
    
    private Visits[] allVisits = new Visits[366];//details of each visit during the year
    
    int y;                    // number of visits this year

    /**
     * ------ Constructors ------------------------------------------------------------------
     */
    // Constructor for new member
    public Points(String id)  {    
        memberId = id;    
        bonusPoints = 0;    
        y = 0;    
        statusNow  =  "Bronze";  
    }

    // Constructor for existing member with points carried over
    public Points(String id, int bp)  {    
        memberId = id;
        bonusPoints = bp;
        y = 0;
        statusNow = "Bronze";
    }

    /**
     * ------- Methods ---------------------------------------------------------------------------
     */

    // Accessor methods
    public String getMemberId() {
        return this.memberId;
    }

    // Mutator methods

    // Behaviour methods
    public boolean isGold() {
        boolean isGold = false;
        // todo: write code that based on a condition will set it to true
        return isGold;
    }
}
