package topic05learningaids.queues;

public class Message {
    
    /**
     * --- Attributes (State) ----
     */
    String title;

    String body;

    String contact;

    boolean isRead;

    /**
     * 
     * @param title
     * @param body
     * @param contact
     */
    public Message(String title, String body, String contact) {
        this.title = title;
        this.body = body;
        this.contact = contact;
    }

    /**
     * --- Behaviour --------------------------
     */
    public void read() {
        this.isRead = true;
    }
}
