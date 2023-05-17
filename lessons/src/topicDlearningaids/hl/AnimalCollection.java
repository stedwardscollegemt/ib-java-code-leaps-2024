package topicDlearningaids.hl;

public class AnimalCollection {
    
     /**
     * -------- Attributes ------------------------------------
     */
    Animal headAnimal;

    Animal currentAnimal;

    /**
    * -------- Constructor ------------------------------------
    */ 
    public AnimalCollection(Animal headAnimal) {
        this.headAnimal = headAnimal;
        this.currentAnimal = headAnimal;
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
        return null;
    }

    public boolean isEmpty() {
        if (this.headAnimal == null) {
            return true;
        }
        return false;
    }
}
