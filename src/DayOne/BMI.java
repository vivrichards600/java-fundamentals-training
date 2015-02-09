package DayOne;

public class BMI {

    public static void main (String [] args) {

        float height = 176;
        float weight = 76;
        float bmi = weight / (height *  height);

        System.out.println("Persons BMI based on a height of " + height + " and weight of " + weight + " is " + bmi);
    }
}
