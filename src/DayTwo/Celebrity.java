package DayTwo;

public class Celebrity {

    String fullname;
    double height;
    float weight;

    Celebrity(String fullname, double height, float weight) {
        this.fullname = fullname;
        this.height= (float)height;
        this.weight = (float)weight;
    }

    float getBMI()  {
        return weight / (float)(height * height);
    }

    public static Celebrity factory(String rawMaterial){
        String [] pieces = rawMaterial.split("\t");
        return (new Celebrity(pieces[0],Integer.parseInt(pieces[1]),(Integer.parseInt(pieces[2]))));
    }

    //Test
    public static void main (String [] args) {

        String DummyData = "Vivaldo\t1.42\65";

        Celebrity[] Person = new DayTwo.Celebrity[4];
        Person[0] = new Celebrity("Viv",1.42,65);
        Person[1] = new Celebrity("Dave",1.79,79);
        Person[2] = new Celebrity("Steve",1.88,81);
        Person[3] = new Celebrity("Mark",1.63,77);

        for (int data=0; data<Person.length; data++){
            float bmiResult = Person[data].getBMI();
            System.out.println("Celebrity for " + Person[data].fullname + " with height of " + (float)Person[data].height + " and weight " + Person[data].weight + " is " + bmiResult);
        }
    }
}


