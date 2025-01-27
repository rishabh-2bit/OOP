package DesignPatterns.Behavioral.Strategy;

public class StategyDesignPatternDemo {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();

        // Use Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "John Doe"));
        context.executePayment(100);  // Paid 100 using Credit Card (1234-5678-9012-3456)

        // Use PayPal
        context.setPaymentStrategy(new PayPalPayment("john.doe@example.com"));
        context.executePayment(50);   // Paid 50 using PayPal (john.doe@example.com)

        // Use Bitcoin
        context.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        context.executePayment(200);  // Paid 200 using Bitcoin (1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa)

	}

}
