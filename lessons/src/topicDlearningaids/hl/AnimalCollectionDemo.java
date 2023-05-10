package topicDlearningaids.hl;

public class AnimalCollectionDemo {
    
    public static void main(String[] args) {
        
        // target animal to search for
        Animal targetAnimal = new Animal("Persian Cat", "Egypt", null, null, false);

        // search flag
        boolean isFound = false;

        // create an instance of my Animal Collection
        AnimalCollection myAnimals = new AnimalCollection();

        // reset to the head
        myAnimals.resetNext();

        // looping through my collection
        while (myAnimals.hasNext()) {
            Animal nextAnimal = myAnimals.getNext();
            if (nextAnimal.name == targetAnimal.name) {
                System.out.println("I have found my animal!");
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("I have not found my animal, I am so sorry!");
        }
    }
}
