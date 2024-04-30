package Payment;

// Product Interface
abstract class PaymentBase{
    public abstract void pay(float amount);
}

// Concrete Product
class CreditCard extends PaymentBase{
    @Override
    public void pay(float amount) {
        System.out.println("Credit Card & Amount Is: " + amount);
    }
}

// Concrete Product
class PayPal extends PaymentBase{
    @Override
    public void pay(float amount) {
        System.out.println("PayPal & Amount Is: " + amount);
    }
}

// Concrete Product
class GooglePay extends PaymentBase{
    @Override
    public void pay(float amount) {
        System.out.println("Google Pay & Amount Is: " + amount);
    }
}

// Creator
public class Payment {
    static Object pay_type(String payment_type){
        switch (payment_type) {
            case "CreditCard" -> {
                return new CreditCard();
            }
            case "PayPal" -> {
                return new PayPal();
            }
            case "GooglePay" -> {
                return new GooglePay();
            }
            case null, default -> {
                System.out.println("Unknown Payment Type");
                return null;
            }
        }
    }
}
