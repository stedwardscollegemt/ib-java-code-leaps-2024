package topic05learningaids.queues;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Message Queue is a Thread so that it can run in parallel
 * to the Main Java thread (thinking concurrently). 
 * We will learn more about "extends" next year.
 */
public class MessageQueue extends Thread {

    /**
     * --- (Attributes) State ----------------
     */
    Message[] queue;

    final int HEAD_INDEX = 0;

    int tailIndex;

    File logFile;

    // for thread to work
    volatile boolean active;

    /**
     * The constructor
     */
    public MessageQueue() {
        super("MessageQueueThread");
        this.logFile = new File("lessons\\log\\message_queue_log.txt");
        try { logFile.createNewFile(); } catch(IOException e) {}
        queue = new Message[5];
        tailIndex = HEAD_INDEX;
        active = true;
    }

    /**
     * A method for the Thread
     */
    public void run() {
        System.out.println(this.getName() + " has initialised correctly...");
        
        // while we have messages to consume OR user is still sending messages
        while(!isEmpty() || active) {
            Message consumeMessage = this.dequeue();
            if (consumeMessage != null) {
                consumeMessage.read();
                try {
                    // make it seem like it is really taking long to read a message
                    Thread.sleep(5000);
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

    public void deactivate() {
        this.active = false;
    }
}
