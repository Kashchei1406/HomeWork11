package HomeWork8;

public  class MinimumEquipment {

    private final String name = "Minimal";
    private final String transmission = "Manual Transmission";
    private final String engine = "1.6 TFSi";
    private final String interior = "Cloth interior";




    @Override
    public String toString() {
        return String.format("%s, transmission: %s, engine: %s, interior: %s", name, transmission, engine, interior);

    }


}
