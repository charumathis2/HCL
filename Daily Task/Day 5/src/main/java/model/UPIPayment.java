
package model;

public class UPIPayment extends Payment {

    public UPIPayment(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment made using UPI.");
        displayAmount();
    }
}
