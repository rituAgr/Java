package Assignment5;
public class PersonName
{
    final int MAXLEN = 48;
    String value;

    //constructor
    public PersonName(String last, String rest)
    {
        value = last.trim() + "," + rest.trim();
        if (value.length() > MAXLEN)
            value = value.substring (0, MAXLEN);
    }

    //  Accessors

    public String Surname() {
        return value.substring(0, value.indexOf(',', 0));
    }

    public String Prenames()
    {return value.substring (value.indexOf (',',0) + 1);}


    public  String ToString ()      //  Internal name format
        {
            return value;
        }

    public String Ename() 					//  English name format
    {int commaPosn = value.indexOf(',',0);
        return value.substring(commaPosn+1) + " " + value.substring(0,commaPosn);
    }

//  Test PersonName

    public static void main(String args[])
    {   System.out.println("Testing PersonName");
        PersonName[] roster = {
            // Checking how does it treat to two word last name Names
                new PersonName("De Gaulle","Chuck"),
                //checking how does it treat singlr name Person's Name
                new PersonName("","Cher"),
                //checking how doe sit treat last name with special character
                new PersonName("Rimsky-Korsakoff", "Nikolai"),
                //checking how does it treats Person's Name with many words First name
                new PersonName("Bush", "George Herbert Walker"),
                // Check if it remove followinf and trailing spaces
                new PersonName("   Obama  ",  "   Barack   "),
                //checking how does it treat very large name that exceeds the permissible limit
                new PersonName("ImpossiblyLongLastName", "Even Longer First and Multiple Middles"),
        };

            for (int k = 0; k < roster.length; ++k)
            {
                System.out.print("(" + k + ")");
                System.out.println("\t\t(" + roster[k].Surname()+")\t("+ roster[k].Prenames() + ")");
            }

        }
    }
