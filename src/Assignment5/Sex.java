package Assignment5;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 * Created by Ritu on 11/19/16.
 */
// Sex (or Gender) class  (copyright 1999, Information Disciplines, Inc.)

//  This elementary discrete data type represents the sex of a person
//  or other object.  If provides roughly the same functionality as IDI's
//  C++ Sex class, and shares the same internal representation.


//  (Original version -- before Java supported enum)

public class Sex {
    byte value;                //  Legal values are one of the following
    Sex()
    {
        value=-1;
    }
    //Setter
    void  setGender(String gen) {
        if(gen.toLowerCase().equals("unknown"))
            value=0;
        if(gen.toLowerCase().equals("male"))
            value=1;
        if(gen.toLowerCase().equals("female"))
            value=2;
    }
    //getters
    String getGender() {
        if (this.value < 0 || this.value > 2)
            return null;

        if (this.value == 1)
            return "male";
        else if (this.value == 2)
            return "female";
        else
            return "unknown";
    }

    public static void main(String args[]) {
        Sex[] roster =new Sex[4];
        for (int k = 0; k < roster.length; ++k)
            roster[k]=new Sex();
        roster[0].setGender("Male");
        roster[1].setGender("fjsdh");
        roster[2].setGender("Female");
        roster[3].setGender("Unknown");
        System.out.println("Testing Sex : ");

        for (int k = 0; k < roster.length; ++k) {
            String s = roster[k].getGender();
            if(s==null)
                System.out.println("InValid Entry");
            else
                System.out.println("Gender is "+s);
        }
    }
}