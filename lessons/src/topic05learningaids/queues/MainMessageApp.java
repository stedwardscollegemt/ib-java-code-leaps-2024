package topic05learningaids.queues;

import helpers.Keyboard;

public class MainMessageApp {
    
    public static volatile boolean sendingMessages = true;

    public static void main(String[] args) {

        MessageQueue myMessageConsumer = new MessageQueue();
        myMessageConsumer.start(); // this is running concurrently with main()

        System.out.println("*** Welcome to my MessageQueue ***");
        System.out.println("**********************************");
        System.out.println("");

        char userPrompt;
        int count = 0;

        do {
            
            System.out.println("Press [M] to send a message or [S] to stop sending messages.");
            userPrompt = Keyboard.readChar();
            
            if (userPrompt == 'm') {
                // message creation
                System.out.println("Please type in your message in one line and press Enter.");
                String messageBody = Keyboard.readString();
                Message myMessage = new Message("Message " + (count + 1), messageBody, "");
                
                // keep trying to send message
                boolean messageSent = false;
                while(!messageSent) {
                    if (!myMessageConsumer.isFull()) {
                        myMessageConsumer.enqueue(myMessage);
                        messageSent = true;
                        System.out.println("We have sent your message! Give it some time to process.");
                        count = count + 1;
                    }
                }  
            }

        } while (userPrompt != 's');

        myMessageConsumer.deactivate();

        while(myMessageConsumer.isAlive()) {
            System.out.println("We are not sending messages anymore but queue is still processing so we need to wait.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }

        System.out.println("Yay, we created a thread safe program! We rock. See ya later allegator.");
    } 
}
