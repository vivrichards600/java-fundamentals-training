package DayOne;

public class Table {

    public static void main (String [] args) {

        int tableLength = 1800;
        int tableWidth = 800;
        int frontage = 850;
        int peoplePerTable = getPeoplePerTable(tableLength, frontage);

        System.out.println("Number of people per table is " + peoplePerTable);
    }

    private static int getPeoplePerTable(int tableLength, int frontage) {
        return ((tableLength / frontage) * 2 );
    }
}
