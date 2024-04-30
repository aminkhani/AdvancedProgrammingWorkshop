package WithoutThread;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        RandomNumberGenerator generator = new RandomNumberGenerator(numbers);
        OddEvenChecker oddEvenChecker = new OddEvenChecker(numbers);
        PrimeChecker primeChecker = new PrimeChecker(numbers);

        generator.run();
        System.out.println("-------------------------");
        oddEvenChecker.run();
        System.out.println("-------------------------");
        primeChecker.run();
        System.out.println("-------------------------");
    }
}
