package topic04learningaids;

/**
 * Topic 4.1.1 Thinking Procedurally
 */
public class StackPerfectCheeseburger {

    static String perfectBurger;

    public static void main(String[] args) {
        String[] ing = {"TB", "S1", "O", "P", "CH", "PA", "T", "L", "S2", "BB"};

        int currentIng = 10;

        while(currentIng > 0) {
            stack(ing[currentIng - 1]);
            currentIng = currentIng - 1; 
        }

        System.out.println("Your dinner is served. Bon appetit!\n");
        System.out.println(perfectBurger);
    }

    public static void stack(String ing) {
        if (perfectBurger == null) {
            perfectBurger = ing;
        } else {
            perfectBurger = ing + "\n" + perfectBurger; 
        }
    }
}