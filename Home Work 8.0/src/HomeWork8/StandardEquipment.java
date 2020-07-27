package HomeWork8;

public class StandardEquipment {


    private final String name = "Standard";
    private final String transmission = "Automatic Transmission";
    private final String engine = " 1.8 TFSi ";
    private final String interior = "Cloth interior";


    @Override
    public String toString() {
        return String.format("%s, transmission: %s, engine: %s, interior: %s", name, transmission, engine, interior);
    }
}
