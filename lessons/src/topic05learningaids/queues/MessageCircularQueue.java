package topic05learningaids.queues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MessageCircularQueue extends Thread {

    /**
     * --- (Attributes) State ----------------
     */
    Message[] queue;

    int headIndex;

    int tailIndex;

    boolean active;

    File logFile;

    /**
     * The constructor
     */
    public MessageCircularQueue() {
        queue = new Message[5];
        this.logFile = new File("lessons\\log\\message_queue_log.txt");
        headIndex = 0;
        tailIndex = headIndex;
        active = true;
    }

    /**
     * A method for the Thread
     */
    public void run() {
        while(!isEmpty() || active) {
            Message consumeMessage = this.dequeue();
            if (consumeMessage != null) {
                consumeMessage.read();
                try {
                    // make it seem like it is really taking long to read a message
                    Thread.sleep(7000);
                } catch(Exception e) { }
                try {
                    FileWriter fw = new FileWriter(logFile, StandardCharsets.UTF_8, true);
                    fw.write("I consumed " + consumeMessage.title + ":   " + consumeMessage.body + "\n");
                    fw.close();
                } catch (IOException e) { 
                    e.printStackTrace(); 
                };
            }
        }
        System.out.println(this.getName() + " has reached end of run() it will die naturally...");
    } 

    /**
     * --- Behaviour ----------------------
     */
    public void enqueue(Message m) {
        // not full
        if (!isFull()) {
            queue[tailIndex] = m;
            tailIndex = (tailIndex+1) % queue.length;
        }
    }

    public Message dequeue() {
        // check not empty because if empty cannot dequeue
        if (!isEmpty()) {
            Message m = queue[headIndex]; // get message at the head
            // shift all the elements up one
            for (int i = (headIndex + 1); i <= (tailIndex - 1); i++) {
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
        return tailIndex == headIndex;
    }

    public boolean isFull() {
        return tailIndex == queue.length;
    }
}
