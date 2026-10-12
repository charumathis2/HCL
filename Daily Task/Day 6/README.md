# Day 6 — Exception Handling and AI-Assisted Debugging

## Objective
To handle runtime errors using Java exception handling and build a resilient order-processing application.

## Concepts Covered
- Checked and unchecked exceptions
- `try`, `catch`, and `finally`
- `throw` vs. `throws`
- Multi-catch
- Custom exceptions
- Input validation and recovery
- AI-assisted debugging and root-cause analysis

## Project Structure
- `app/Main.java` — Interactive order-processing menu
- `app/OrderProcessor.java` — Order validation and stock management
- `app/DebugExercise.java` — Demonstrates exception handling
- `exception/InsufficientStockException.java` — Handles insufficient stock
- `exception/InvalidQuantityException.java` — Handles invalid quantities

## Business Rules
1. Quantity must be greater than zero.
2. An order cannot exceed available stock.
3. Stock is reduced only when an order succeeds.
4. The menu continues after handled exceptions.

## Execution
Compile the Java files and run `app.Main`.

Run the debugging exercise separately using `app.DebugExercise`.

## Testing
- Valid order
- Zero or negative quantity
- Quantity greater than available stock
- Stock verification after successful and failed orders
- Invalid numeric input
- AI-assisted debugging notes in `debugging-notes.md`