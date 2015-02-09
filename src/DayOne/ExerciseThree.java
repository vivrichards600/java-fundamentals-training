package DayOne;

public class ExerciseThree {

        public static void main (String [] args) {

            System.out.print("Enter number of coffees:");
            int days= (int)(WellHouseInput.readNumber());
            int delegates = 5;
            int coffees = days * (delegates + 1) * 2;

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

