package Payment;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment method: ");
        String pay_type = input.nextLine();
        Object payment = Payment.pay_type(pay_type);
        System.out.println(payment);
    }
}
