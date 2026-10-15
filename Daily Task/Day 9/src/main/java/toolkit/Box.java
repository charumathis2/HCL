
package toolkit;

public class Box<T extends Number> {

    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double getDoubleValue() {
        return value.doubleValue();
    }

    @Override
    public String toString() {
        return "Box contains: " + value;
    }
}
