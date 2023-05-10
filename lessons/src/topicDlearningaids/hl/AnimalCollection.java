package topicDlearningaids.hl;

public class AnimalCollection {
    
     /**
     * -------- Attributes ------------------------------------
     */


    /**
    * -------- Constructor ------------------------------------
    */ 
    public AnimalCollection() {}


    /**
     * -------- Behaviour Methods ------------------------------------
     */ 
    // As contracted in the IB collection
    public void resetNext() {

    }

    public Animal getNext() {
        return null; // TODO: change this
    }


    public boolean hasNext() {
        return false; // TODO: change
    }

    public void addItem(Animal item) {

    }

    public void removeItem(Animal item) {

    }
    
    // nice perks we want to add for developer, in exams these require 
    /**
     * It gets the last item in the Animal collection
     * @return
     */
    public Animal getTail() {
        return null;
    }

    public boolean isEmpty() {
        return true;
    }
}
