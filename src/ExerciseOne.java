import DayOne.WellHouseInput;

public class ExerciseOne {

    public static void main (String [] args) {

        int days;
        int delegates;
        int coffees;

        days = (int)(WellHouseInput.readNumber());
        delegates = 5;
        coffees = days * (delegates + 1) * 2;

        System.out.println("Java course");
        System.out.println("Learning Java fundamentals");
        System.out.println("* or at least trying to!");
        displayCopyright();
        System.out.println("There will be a total of " + coffees + " coffees drunk");
    }

    public static void displayCopyright() {
        System.out.println("Don't steal");
    }
}
