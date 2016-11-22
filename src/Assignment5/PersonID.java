package Assignment5;

import java.util.Arrays;

/**
 * Created by Ritu on 11/19/16.
 */
//  Person Identifier Class (copyright 2000, Information Disciplines, Inc.)

//  Objects of this class uniquely are intended to uniquely identify a
//  real person.  Of course, since no such universal identifier exists,
//  these identifiers may not really be unique, but users can take steps
//  to assure that they're unique within an application domain or within
//  an organization.

public class PersonID  {

    int value;		  //  Up to 999-99-9999 (one billion  minus 1)
    
    public PersonID (int ssn) 			//  If illegal value, set negative
    {
        value = (ssn <= 0 || ssn > 999999999)? -1 : ssn;
    }


    public String ToString()  {	//  Convert to common display form with hyphens
        if (value == 0) return ("unassigned");
        if (value < 0)	return ("**invalid**");
        int part1, part2, part3;		//  Split into three subfields
        part1 = value / 1000000;
        part2 = (value - (part1 * 1000000)) / 10000 ;
        part3 = value % 10000;
        int[] a = {1,2};
        System.out.println(Arrays.toString(a));
        return Integer.toString(part1) + "-"+ Integer.toString(part2) + "-"	+ Integer.toString(part3);


    }

    //    Relational operators

    public static boolean equalTo(PersonID ls, PersonID rs)
    {return ls.value==rs.value;}
    public static boolean lessThan (PersonID ls, PersonID rs)
    {return ls.value< rs.value;}
    public static boolean notEqualTo(PersonID ls, PersonID rs)
    {return !equalTo(ls,rs);}
    public static boolean greaterThan(PersonID ls, PersonID rs)
    {return   lessThan(rs,ls);}
    public static boolean lessThanEqualTo(PersonID ls, PersonID rs)
    {return !greaterThan(rs,ls);}
    public static boolean greaterThanEqualTo(PersonID ls, PersonID rs)
    {return !lessThan(rs,ls);}


}

