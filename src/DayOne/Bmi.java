package DayOne;

public class Bmi {

    public static void main (String [] args) {

        System.out.print("Enter height:");
        float height = (float)(WellHouseInput.readNumber());
        System.out.print("Enter weight:");
        float weight = (float)(WellHouseInput.readNumber());

        float BMI = calculateBmi(height, weight);

        System.out.println("for height " + height + " and weight " + weight);
        System.out.println("Initial BMI is " + BMI);

        if (BMI > 0) {
            if (BMI < 18.5) System.out.println("You are underweight. Feed!");
            if ((18.5 < BMI) && (BMI < 24.9)) System.out.println("You are of normal weight. Keep it up!");
            if ((25 < BMI) && (BMI < 29.9)) System.out.println("You are overweight. Cool down a bit!");
            if ((30 < BMI) && (BMI < 34.9)) System.out.println("You are obese, class I. Beware!");
            if ((35 < BMI) && (BMI < 39.9)) System.out.println("You are obese, class II. You damage yourself!");
            if (BMI > 40) System.out.println("You are obese, class III. Go see a doctor!");
        }

        int slims = 0;
        while (BMI > 24.9f) {
            slims = slims + 1;
            weight = weight - 2.0f;
            System.out.println("Drop to " + weight + "kgs ... ");
            BMI = calculateBmi(height,weight);
            System.out.println("new BMI is " + BMI);
            if (slims > 10) {
                System.out.println("Check with a doctore");
                break;
            }
        }

    }

    public static float calculateBmi(float height, float weight) {
        return (weight / (height * height));
    }
}
