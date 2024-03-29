package topicDlearningaids.hl;

/**
 * Link to D.4.10
 */
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

    private Animal head;
   
    /**
     * -------- Constructor ------------------------------------
     */ 
    public Animal (String name, String countryOfOrigin, Animal next, Animal previous, boolean isHead) {
        // node data
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        // set pointers
        this.next = next;
        this.previous = previous;

        if (isHead) {
            this.setAsHead();
        }
    }
    
    /**
     * -------- Behaviour ------------------------------------
     */
    private void setAsHead() {
        this.head = this;
    }

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

    public Animal getNext() {
        return this.next;
    }

    public Animal getPrevious() {
        return this.previous;
    }

    // the current node to visit must be the first
    public void resetNext() {
         // node data
         this.name = head.name;
         this.countryOfOrigin = head.countryOfOrigin;
         // set pointers
         this.next = head.next;
         this.previous = head.previous;
    }
}
