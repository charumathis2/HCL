
package model;

public class RefundableCardPayment extends CardPayment implements Refundable {

    public RefundableCardPayment(double amount) {
        super(amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of Rs. " + amount + " processed for card payment.");
    }
}
