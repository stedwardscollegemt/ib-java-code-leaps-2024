package yr12assignment;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * This is a simple menu-driven program for simple banking.
 * Transactions are read from a file and loaded into an array.
 * This application allows the user to display information,
 * send money, add money and exit the program.
 */
public class MySimpleBankingApp {
    /**
     * Declare variables that can be used by every method here! 
     */
    public static double balance = 250.00;

    public static String currency = "Euro";

    public static String[] transactions = new String[100];

    public static String[] contacts = {"melb1234", "wchurchill456"};

    public static void main(String[] args) {

        // we are calling this method first to load data
        // do not remove this
       init();
       
       // TODO: provide a menu of options:
       // A. Display Account Information
       // B. Add Money
       // C. Send Money
       // D. Quit

       // TODO: Declare char userChoice and set it to 'A' by default

       // TODO: while userChoice != 'd'
       //          trigger appropriate action based on user choice (use switch case statement)
       //          ask for user choice again

    }

    // TODO: create custom methods here for: add money, display all transactions, send

    /**
     * an advanced function written by Ms C to read data from a file and store it into transactions
     */
    public static void init() {
        // make sure you have a text file
        File file = new File("lessons\\src\\yr12assignment", "MySimpleTransactions.txt");
        if (file.exists()) {
            int lines;
            try (Stream<String> stream = Files.lines(file.toPath(), StandardCharsets.UTF_8)) {
                lines = (int) stream.count();
                stream.close();
                if (lines > 0) {
                    Scanner fileScan = new Scanner(file);
                    for (int i = 0; i < lines; i++) {
                        transactions[i] = fileScan.nextLine();
                    }
                    fileScan.close();
                }
            } catch (IOException e) {
                System.out.println("Err: Did not manage to load data.");
            }
        }
    }
}