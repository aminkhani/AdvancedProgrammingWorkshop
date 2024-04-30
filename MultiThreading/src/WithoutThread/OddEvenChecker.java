package WithoutThread;

public class OddEvenChecker{
    private final int[] numbers;

    public OddEvenChecker(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        }
    }
}
