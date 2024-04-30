package MultiThreading;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        int[] numbers = new int[5]; // Array to store generated numbers

        RandomNumberGenerator generatorThread = new RandomNumberGenerator(numbers);
        OddEvenChecker oddEvenCheckerThread = new OddEvenChecker(numbers);
        PrimeChecker primeCheckerThread = new PrimeChecker(numbers);

        generatorThread.start();
        oddEvenCheckerThread.start();
        primeCheckerThread.start();

        try {
            // Wait for all threads to complete
            generatorThread.join();
            oddEvenCheckerThread.join();
            primeCheckerThread.join();
        } catch (InterruptedException e) {
            logger.warning("Main thread was interrupted: " + e.getMessage());
        }
        logger.info("All threads have completed their tasks.");
    }
}
