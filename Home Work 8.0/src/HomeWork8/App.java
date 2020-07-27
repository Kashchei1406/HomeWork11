package HomeWork8;

import java.lang.reflect.Type;

public class App {

    public static void main(String[] args) {

        MinimumEquipment minimumEquipment = new MinimumEquipment();
        StandardEquipment standardEquipment = new StandardEquipment();
        MaximumEquipment maximumEquipment = new MaximumEquipment();

        Car<MinimumEquipment> bmw = new Car<>("BMW E60", 5, minimumEquipment);
        Car<StandardEquipment> bmw1 = new Car<>("BMW E39", 3, standardEquipment);
        Car<MaximumEquipment> bmw2 = new Car<>("BMW F01", 5, maximumEquipment);


        System.out.println(bmw);
        System.out.println(bmw1);
        System.out.println(bmw2);

        System.out.println();
        System.out.println("Inner state:");
        bmw.showInnerState();
        bmw1.showInnerState();



    }
}
