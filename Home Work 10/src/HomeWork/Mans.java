package HomeWork;

import HomeWork.Exeption.AgeException;

public class Mans {

    private String yearOfBirth;


    public Mans(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
        try {
            int parseyearOfBirth = Integer.parseInt(yearOfBirth);
            if (parseyearOfBirth < 1920) {
                try {
                    throw new AgeException("Year of birthday incorrect!");
                } catch (AgeException exception) {
                    exception.printStackTrace();
                }
            }

        } catch (NumberFormatException e) {
            System.err.println("Year of birthday incorrect! Enter the number!");
            e.printStackTrace();
        }

    }

}
