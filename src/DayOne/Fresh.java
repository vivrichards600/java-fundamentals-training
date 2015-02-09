package DayOne;

public class Fresh {

    public static void main(String [] args) {

        //Get the length and seats of a train

        System.out.print("How long? ");
        int cars = (int)(WellHouseInput.readNumber());
        System.out.print("How many seats? ");
        int seats = (int)(WellHouseInput.readNumber());

        int capacity = (int)(seats * cars * 1.4);
        System.out.println("Each train can take " + capacity);

        // get the number going to the Millenium Stadium by rail

        System.out.print("How many at the match?");
        int crowd = (int)(WellHouseInput.readNumber());

        // fill a series of trains with the people wanting to go home

        while (crowd > 0)  {
            System.out.println("Number waiting is " + crowd);
            System.out.println("Need another train");
            crowd = crowd - capacity;

        }

    }
}
