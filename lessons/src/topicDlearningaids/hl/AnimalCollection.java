package topicDlearningaids.hl;

/**
 * Link to D.4.10
 */
public class AnimalCollection {
    /**
     * -------- Attributes ------------------------------------
     */
    private Animal headAnimal;

    // our iterator of type Animal because it is self-referential
    private Animal iteratorAnimal;

    /**
    * -------- Constructor ------------------------------------
    */ 
    public AnimalCollection(Animal headAnimal) {
        this.headAnimal = headAnimal;
        this.iteratorAnimal = headAnimal;
    }


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
        Animal tail = getTail();
        tail.next = item;
    }

    public void removeItem(Animal item) {

    }
    
    // nice perks we want to add for developer, in exams these require 
    public Animal getHead() {
        return this.headAnimal;
    }
    /**
     * It gets the last item in the Animal collection
     * @return
     */
    public Animal getTail() {
        Animal tempIterator = this.headAnimal;
        while (tempIterator.hasNext()) {
            tempIterator = tempIterator.getNext();
        }
        return tempIterator;
    }

    public boolean isEmpty() {
        if (this.headAnimal == null) {
            return true;
        }
        return false;
    }
}
