package Shape;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your payment method: ");
        String shape_type = input.nextLine();
        Shape.shape_type(shape_type);
    }
}
