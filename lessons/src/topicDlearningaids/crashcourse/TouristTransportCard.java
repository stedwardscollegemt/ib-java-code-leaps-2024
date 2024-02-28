package topicDlearningaids.crashcourse;

import java.util.Date;

/**
 * Define extends:
 * 
 * It is a keyword in Java that indicates the is-a relationship.
 * In this example TouristTransportCard is-a type of TransportCard.
 * All TransportCard abilities could be inherited, but specific variables and
 * methods could still exist within this context.
 */
public class TouristTransportCard extends TransportCard {
    
    // ---- Custom Variables -----------------------------
    private Date activationDate;

    private Date expiryDate;

    public TouristTransportCard() {
        super(); // this refers to the parent constructor
    }
}
