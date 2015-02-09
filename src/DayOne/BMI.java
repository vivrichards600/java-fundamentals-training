package DayOne;

public class BMI {

    public static void main (String [] args) {

        System.out.print("Enter height:");
        float height = (WellHouseInput.readNumber());
        System.out.print("Enter height:");
        float weight = (WellHouseInput.readNumber());
        float bmi = weight / (height *  height);

        System.out.println("Persons BMI based on a height of " + height + " and weight of " + weight + " is " + bmi);
    }
}
