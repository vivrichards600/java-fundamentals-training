package DayTwo;

import DayOne.WellHouseInput;

public class BMI {

    String fullname;
    double height;
    float weight;

    BMI(String fullname, double height, float weight) {

        this.fullname = fullname;
        this.height= (float)height;
        this.weight = (float)weight;
    }

    float getBMI()  {
        return weight / (float)(height * height);
    }


    //Test
    public static void main (String [] args) {
        BMI person = new BMI("Viv",1.79,79);

        float bmiResult = person.getBMI();
        System.out.println("BMI for " + person.fullname + " with height of " + (float)person.height + " and weight " + person.weight + " is " + bmiResult);
    }
}


