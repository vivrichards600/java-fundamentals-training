package DayOne;

import java.util.*;
import java.io.*;

/** Reading from the keyboard or a file

 This is an example used on our Java Programming courses
 to provide early access to user input, and supporting also
 input from a file so that each program that uses it can be
 demonstrated in a batch mode.

 */

public class WellHouseInput {

    private static BufferedReader inputfile = null;
    private static BufferedReader standard = null;
    private static int source = 0;

    public static String DataSource = null;

    public static float readNumber() {
        String inline = readLine();
        try {
            Float from_user = Float.valueOf(inline);
            return from_user.floatValue();
        } catch (Exception e) {
            return (0.0f);
        }
    }

    public static String readLine() {
        try{
            if (standard == null) {
                if (DataSource != null) {
                    try {
                        standard = new BufferedReader(new FileReader(DataSource));
                        source = 1;
                    } catch (Exception e) {
                    }
                }
                if (source == 0) {
                    standard = new BufferedReader(new InputStreamReader(System.in));
                }
            }
            String inline = standard.readLine();
            if (source == 1) {
                if (inline != null) {
                    System.out.println(inline);
                } else {
                    System.out.println();
                }
            }
            return inline;
        } catch (Exception e) {
            return "";
        }
    }

// ---------------------------------------------

    public static boolean openFile(String name) {
        try {
            inputfile = new BufferedReader(
                    new FileReader(name));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static String readFile() {
        try{
            String inline = inputfile.readLine();
            return inline;
        }
        catch (Exception e)
        {
            return (null);
        }
    }

}