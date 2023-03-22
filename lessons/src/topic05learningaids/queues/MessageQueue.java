package topic05learningaids.queues;

public class MessageQueue extends Thread {

    private Message[] queue;

    public MessageQueue() {
        queue = new Message[5];
    }
    
    public void run() {

    } 
}
