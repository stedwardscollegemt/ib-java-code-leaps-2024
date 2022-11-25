package topic05learningaids;

/**
 * Thinking Recursively
 */
public class FibonacciSequence {
    
    public static void main(String[] args) {
        // TODO: call the printFibonacciSeries and pass in 6 and 0
    }

    public static void printFibonacciSeries(int n, int step) {
        System.out.println(fibonacci(step) + " ");

        if (step < n) {
            step = step + 1;
            printFibonacciSeries(n, step);
        }
    }

    public static int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n-1) + fibonacci(n-2);
        } else {
            return n;
        }
    }
}
