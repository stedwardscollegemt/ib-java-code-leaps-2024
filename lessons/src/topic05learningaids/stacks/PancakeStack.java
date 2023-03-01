package topic05learningaids.stacks;

public class PancakeStack {

    /**
     * --- Attributes (State) -----------------------------
     */

    int size; // this is a stack attribute

    Pancake[] stack = new Pancake[5];

    String topping; // this is a pancake attribute

    /**
     * --- Methods (Behaviour) -----------------------------
     */
    public void push() {
        // create the pancake
        Pancake p = new Pancake();
        int pos = stack.length - size;
        stack[pos] = p;
        size++;
    }

    public Pancake pop() {
        int pos = stack.length - size;
        Pancake p = stack[pos];
        stack[pos] = null;
        size--;
        return p;
    }
    
}
