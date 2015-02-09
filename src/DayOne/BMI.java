package DayOne;

public class BMI {

    public static void main (String [] args) {

        System.out.print("Enter height:");
        float height = (float)(WellHouseInput.readNumber());
        System.out.print("Enter height:");
        float weight = (float)(WellHouseInput.readNumber());

        float bmi = (weight / (height *  height));

        System.out.println("Your BMI is " + bmi);

        if (bmi > 0) {
            if (bmi < 18.5) System.out.println("You are underweight. Feed!");
            if ((18.5 < bmi) && (bmi < 24.9)) System.out.println("You are of normal weight. Keep it up!");
            if ((25 < bmi) && (bmi < 29.9)) System.out.println("You are overweight. Cool down a bit!");
            if ((30 < bmi) && (bmi < 34.9)) System.out.println("You are obese, class I. Beware!");
            if ((35 < bmi) && (bmi < 39.9)) System.out.println("You are obese, class II. You damage yourself!");
            if (bmi > 40) System.out.println("You are obese, class III. Go see a doctor!");
        }
    }
}
