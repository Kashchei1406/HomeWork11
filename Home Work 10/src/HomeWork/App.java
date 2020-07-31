package HomeWork;


import java.util.Scanner;

public class App {

    private static String yearOfBirth;
    private static int dayOfBirth;
    private static int montBirth;


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите год вашего рождения:");
        yearOfBirth = scan.next();

        boolean choice = true;

        while (choice)

            try {
                System.out.println("Введите месяц вашего рождения: ");
                montBirth = Integer.parseInt(scan.next());
                choice = false;
            } catch (NumberFormatException exception1) {
                System.err.println("Введите число!");
                choice = true;
            }

        try {
            System.out.println("Введите день вашего рождения:");
            dayOfBirth = Integer.parseInt(scan.next());

        } catch (NumberFormatException exception) {
            System.err.println("Введите число!");


        } finally {
            System.out.println("Спасибо!");
        }

        Man man = new Man(dayOfBirth, montBirth, yearOfBirth);


        Noname noname = null;

        try {
            noname.DoAnything();
        } catch (NullPointerException nullPointerException) {
            nullPointerException.printStackTrace();
        }

    }


}

