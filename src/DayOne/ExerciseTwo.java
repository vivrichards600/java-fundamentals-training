package DayOne;

public class ExerciseTwo {

        public static void main (String [] args) {

            int days = 4;
            int delegates = 5;
            int coffees = days * (delegates + 1) * 2;

            if(coffees < 20) {
                System.out.println("Use the canteen");
            } else if (coffees > 60) {
                System.out.println("Get an urn");
            } else {
                System.out.println("Buy a kettle");
            }

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
