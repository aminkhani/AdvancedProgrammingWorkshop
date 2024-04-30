package WithoutThread;

import java.util.Random;

public class RandomNumberGenerator{
    private final Random random;
    private final int[] numbers;

    public RandomNumberGenerator(int[] numbers) {
        this.random = new Random();
        this.numbers = numbers;
    }

    public void run() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Generate random numbers between 0 and 99
            System.out.println("Generated: " + numbers[i]);
        }
    }
}
