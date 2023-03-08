package topic05learningaids.stacks;

public class PancakeStack {

    /**
     * --- Attributes (State) -----------------------------
     */
    int size; // this is a stack attribute

    Pancake[] stack = new Pancake[5];

    String topping; // this is a pancake attribute

    public PancakeStack(String topping) {
        this.topping = topping;
        this.size = 0;
    }

    /**
     * --- Methods (Behaviour) -----------------------------
     */
    public void push() {
        if (!isFull()) {
            // create the pancake
            Pancake p = new Pancake();
            size++;
            int pos = stack.length - size;
            stack[pos] = p;
        }
    }

    public Pancake pop() {
        if(!isEmpty()) {
            int pos = stack.length - size;
            Pancake p = stack[pos];
            stack[pos] = null;
            size--;
            return p;
        }
        return null;
    } 
    
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == stack.length;
    }
}
