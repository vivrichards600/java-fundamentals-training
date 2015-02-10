package DayTwo;

import DayOne.WellHouseInput;

public class Bus {

    public static void main(String [] args) {

        int count = askAndRead("How many buses? ");
        int c2 = askAndRead("How many seats on each? ");
        System.out.println(count * c2);

    }

    public static int askAndRead(String question) {
        int count = 0;
        while (true) {
            try {
                System.out.print("ASK.. " + question + ": ");
                String gotten = WellHouseInput.readLine();
                count = Integer.parseInt(gotten);
                break;
            } catch (Exception e) {
                System.err.println("Need a number!");
            }
        }
        return count;
    }
}
