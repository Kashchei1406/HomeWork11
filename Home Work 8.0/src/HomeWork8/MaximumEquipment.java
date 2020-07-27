package HomeWork8;

public class MaximumEquipment {

    private final String name = "Maximum";
    private final String transmission = "Automatic Transmission";
    private final String engine = " 3.0 TFSi ";
    private final String interior = "Leather interior";

    @Override
    public String toString() {
        return String.format("%s, transmission: %s, engine: %s, interior: %s", name, transmission, engine, interior);
    }
}
