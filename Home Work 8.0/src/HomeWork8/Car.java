package HomeWork8;

public class Car<T> {


    private String name;
    private Seats seats;
    private T equipment;


    public Car(String name, int sits, T equipment) {
        this.name = name;
        this.seats = new Seats(sits);
        this.equipment = equipment;
    }

    public void showInnerState() {
        seats.showBodyAndSits();
        seats.aVoid(equipment);
    }

    private class Seats {

        private int seats;
        private T equipment;


        public void aVoid(T equipment) {
            System.out.println(equipment);
        }

        public Seats(int sits) {
            this.seats = sits;
        }

        private CoupeOrSedan showCoupeOrSedan(int sits) {
            if (sits > 3) {
                return CoupeOrSedan.SEDAN;
            }
            return CoupeOrSedan.COUPE;
        }

        public void showBodyAndSits() {
            System.out.println(name + " This car has a seats " + seats + " Body: " + showCoupeOrSedan(seats));
        }

        @Override
        public String toString() {
            return "" + showCoupeOrSedan(seats);
        }
    }

    @Override
    public String toString() {
        return "HomeWork8.Car" + " " + name + " " + seats + ", equipment = " + equipment + ".";
    }
}
