package WithoutThread;

public class PrimeChecker {
    private final int[] numbers;

    public PrimeChecker(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is prime.");
            } else {
                System.out.println(number + " is not prime.");
            }
        }
    }

    // Method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num <= 3) return true;

        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }
}
