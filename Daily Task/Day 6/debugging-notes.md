# Day 6 — AI-Assisted Debugging Notes

## Bug 1: Invalid Number Conversion

**Problem:** `Integer.parseInt()` was given a `null` value.

**Exception:** `NumberFormatException`

**Root Cause:** The method cannot convert `null` into an integer.

**Fix:** Validate the input before parsing it.

```java
if (quantityText == null || quantityText.isBlank()) {
    System.out.println("Quantity is required.");
} else {
    int quantity = Integer.parseInt(quantityText);
}
```

**AI Review:** The suggested fix prevents null or blank input from reaching the parsing method. Invalid numeric text still needs to be handled using `NumberFormatException`.

## Bug 2: Invalid Order Quantity

**Problem:** An order is submitted with a quantity of zero or a negative number.

**Exception:** `InvalidQuantityException`

**Root Cause:** The requested quantity violates the order processor's business rules.

**Fix:** Validate the quantity before changing the stock.

```java
if (quantity <= 0) {
    throw new InvalidQuantityException(
        "Quantity must be greater than zero.");
}
```

**AI Review:** This validation correctly rejects zero and negative quantities. Stock should be reduced only after all validations pass.

## Verification

- Tested invalid quantity handling.
- Tested insufficient stock handling.
- Tested a successful order and stock reduction.
- Verified that the menu continues after handled exceptions.