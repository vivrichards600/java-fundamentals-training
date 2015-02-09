package DayOne;

/**
 * Created by vagrant on 09/02/15.
 */
public class h2 {

        public static void main (String [] args) {

            int days;
            int delegates;
            int coffees;

            days = 4;
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
