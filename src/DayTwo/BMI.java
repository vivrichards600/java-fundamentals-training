package DayTwo;

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

        BMI [] Celebrity = new BMI[4];
        Celebrity[0] = new BMI("Viv",1.42,65);
        Celebrity[1] = new BMI("Dave",1.79,79);
        Celebrity[2] = new BMI("Steve",1.88,81);
        Celebrity[3] = new BMI("Mark",1.63,77);

        for (int data=0; data<Celebrity.length; data++){
            float bmiResult = Celebrity[data].getBMI();
            System.out.println("BMI for " + Celebrity[data].fullname + " with height of " + (float)Celebrity[data].height + " and weight " + Celebrity[data].weight + " is " + bmiResult);
        }
    }
}


