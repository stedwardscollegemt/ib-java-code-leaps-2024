package topic05learningaids.stacks;

/**
 * 5.1.10 Arrays as static stacks
 * "As with any abstract data type, 
 *  a stack can be implemented with a variety of data structures, 
 *  such as a linked list or an array. A stack has a variety of applications 
 *  such as in reversing the order of elements, evaluating polish strings, etc."
 * https://brilliant.org/wiki/stacks/
 */
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
