package topicDlearningaids.hl;

public class DemoAnimalCollection {

    static AnimalCollection testMyAnimalCollection;

    static int totalTests = 0;
    
    public static void main(String[] args) {
        testSetup();
        testIsEmptyTrue();
        testLinearSearchEmptyList();
        // todo: more tests
        testTearDown(); 
    }

    private static void testSetup() {
        System.out.println("*** Welcome to our suite of tests for Animal Collection ***");
    }

    private static void testTearDown() {

    }

    public static void testIsEmptyTrue() {
        // When I create an Animal Collection
        AnimalCollection emptyAnimalCol;
        // But pass in null as the head
        emptyAnimalCol = new AnimalCollection(null);
        // Then isEmpty should give me True
        if (emptyAnimalCol.isEmpty()) {
            System.out.print("P. "); // and the test passes
        } else {
            System.out.print("F. "); // and the test fails
        }
        totalTests++;
    }

    // todo: testIsEmptyFalse()
    public static void testIsEmptyFalse() {
        // When I create an Animal Collection

        // But pass in an Animal object "Persian Cat" as the head

        // Then isEmpty should give me False
    }

    public static void testLinearSearchEmptyList() {
        // Given I have an empty linked list
        AnimalCollection myEmptyAnimalCol = new AnimalCollection(null);
        
        // Given I have an animal
        Animal targetAnimal = new Animal("Persian Cat", "Egypt", null, null, false);

        // When I search for my animal...
        boolean isFound = false;
        {
            // reset to the head
            myEmptyAnimalCol.resetNext();
            // looping through my collection
            while (myEmptyAnimalCol.hasNext()) {
                Animal nextAnimal = myEmptyAnimalCol.getNext();
                if (nextAnimal.name == targetAnimal.name) {
                    System.out.println("I have found my animal!");
                    isFound = true;
                }
            }
        }

        // Then I should not find it
        if (!isFound) {
            System.out.print("P. ");
        } else {
            System.out.print("F. ");
        }
        totalTests++;
    }
}
