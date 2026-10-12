
package app;

import model.Payment;
import model.CardPayment;
import model.UPIPayment;
import model.CashPayment;
import model.RefundableCardPayment;

public class Main {

    public static void main(String[] args) {

        Payment[] payments = {
            new CardPayment(1500),
            new UPIPayment(800),
            new CashPayment(500),
            new RefundableCardPayment(2000)
        };

        for (Payment payment : payments) {
            payment.pay();
            System.out.println("--------------------");
        }

        RefundableCardPayment refundable =
                new RefundableCardPayment(2000);

        refundable.refund(500);
    }
}
