package HomeWork;


import HomeWork.Exeption.AgeException;

public class Man extends Mans {

    private final int dayOfBirth;
    private final int month;

    public Man(int dayOfBirth, int month, String yearOfBirth) throws NumberFormatException {
        super(yearOfBirth);
        this.dayOfBirth = dayOfBirth;
        this.month = month;

        if (dayOfBirth > 31) {
            try {
                throw new AgeException("Day of birth incorrect");
            } catch (AgeException exception) {
                System.err.println("Day of birth incorrect");
                exception.printStackTrace();
            }
        }


    }


}

