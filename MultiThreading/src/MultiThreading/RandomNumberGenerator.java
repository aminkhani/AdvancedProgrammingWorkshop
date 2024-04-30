package MultiThreading;

import java.util.Random;

class RandomNumberGenerator extends Thread {
    private final Random random;
    private final int[] numbers;

    public RandomNumberGenerator(int[] numbers) {
        this.random = new Random();
        this.numbers = numbers;
    }

    public void run() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.println("Generated: " + numbers[i]);
        }
    }
}
