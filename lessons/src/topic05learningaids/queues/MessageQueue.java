package topic05learningaids.queues;

/**
 * Message Queue is a Thread so that it can run in parallel
 * to the Main Java thread. 
 */
public class MessageQueue extends Thread {

    /**
     * --- (Attributes) State ----------------
     */
    Message[] queue;

    final int HEAD_INDEX = 0;

    int tailIndex;

    /**
     * The constructor
     */
    public MessageQueue() {
        queue = new Message[5];
        tailIndex = HEAD_INDEX;
    }

    /**
     * A method for the Thread
     */
    public void run() {

    } 

    /**
     * --- Behaviour ----------------------
     */
    public void enqueue(Message m) {
        // not full
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex++;
        }
    }

    public Message dequeue() {
        // check not empty because if empty cannot dequeue
        if (!isEmpty()) {
            Message m = queue[HEAD_INDEX]; // get message at the head
            // shift all the elements up one
            for (int i = (HEAD_INDEX + 1); i <= (tailIndex - 1); i++) {
                Message shift = queue[i];
                queue[i - 1] = shift;
                queue[i] = null;
            }
            tailIndex--;
            return m;
        }
        return null;
    }

    public boolean isEmpty() {
        return tailIndex == HEAD_INDEX;
    }

    public boolean isFull() {
        return tailIndex == queue.length;
    }
}
