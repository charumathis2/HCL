package app;

public class DebugExercise {

    public static void main(String[] args) {

        String quantityText = null;

        try {
            int quantity = Integer.parseInt(quantityText);
            System.out.println("Quantity: " + quantity);

        } catch (NumberFormatException |
                 NullPointerException e) {
            System.out.println("Error type: "
                    + e.getClass().getSimpleName());
            System.out.println("Error message: " + e.getMessage());
        }
    }
}