
package app;

import exception.InsufficientStockException;
import exception.InvalidQuantityException;

public class OrderProcessor {

    private int stock = 5;

    public void processOrder(int quantity)
            throws InsufficientStockException,
                   InvalidQuantityException {

        if (quantity <= 0) {
            throw new InvalidQuantityException(
                    "Quantity must be greater than zero.");
        }

        if (quantity > stock) {
            throw new InsufficientStockException(
                    "Insufficient stock! Available stock: " + stock);
        }

        stock -= quantity;

        System.out.println("Order placed successfully!");
        System.out.println("Quantity ordered: " + quantity);
        System.out.println("Remaining stock: " + stock);
    }

    public int getStock() {
        return stock;
    }
}
