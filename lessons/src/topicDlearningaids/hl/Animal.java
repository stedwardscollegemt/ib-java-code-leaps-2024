package topicDlearningaids.hl;

public class Animal {
    
    /**
     * -------- Attributes ------------------------------------
     */
    // This Animal...
    String name; // e.g. Dog, Koala, Tarantula, Wombat

    String countryOfOrigin; // e.g., Australia, Africa, Brazil
    
    // Meta Information for Linked List of Animal...
    // Objects by reference
    Animal next;

    Animal previous;


   /**
     * -------- Constructor ------------------------------------
     */ 
    public Animal (String name, String countryOfOrigin, Animal next, Animal previous) {
        // node data
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        // set pointers
        this.next = next;
        this.previous = previous;
    }
    
    /**
     * -------- Behaviour ------------------------------------
     */
    public boolean hasNext() {
        if (this.next != null) {
            return true;
        }
        return false;
    }

    public boolean hasPrevious() {
        if (this.previous != null) {
            return true;
        }
        return false;
    }
}
