import java.util.Scanner;
public class Majors
{
    private String major;
    private Scanner scan = new Scanner (System.in);
    private String[] STEM =
            {
            "California Institute of Technology", "University of California Los Angeles", "Stanford",
            "University of California Irvine", "University Southern California",
            "California State University Long Beach",
            "California Polytechnic State University", "San Diego State University",
            "University California Riverside", "UC Merced", "The Master’s University",
            "Fullerton City college", "Long Beach city college",
            "Mt. San Antonio College", "Palomar College"
            };
    private  String[] arts =
            {
            "Occidental College", "Pomona College", "Claremont McKenna College", "Stanford",
            "University of San Diego", "University of La Verne", "Pacific Union College", "La Sierra University",
            "De Anza College", "Fullerton College", "Orange Coast College", "Palomar College"
            };

    /*
    future majors to be updated later on
    private  String[] medicine =
            {

            };
    private  String[] langHumanities =
            {

            };
    private  String[] business =
            {

            };
    private  String[] history =
            {

            };
     */

    public Majors()
    {
        this.major = "";
    }

    public void setMajor(String major)
    {
        this.major = major;
    }

    public  String[] majorEv() //major evaluation
    {
       if(major.equalsIgnoreCase("STEM"))
       {
           return STEM;
       }
       else if(major.equalsIgnoreCase("Visual Performing/Creative Arts"))
       {
           return arts;
       }

       /*else if(major.equalsIgnoreCase("Medical Field"))
       {
           return medicine;
       }
       else if(major.equalsIgnoreCase("Linguistics and Humanities"))
       {
           return langHumanities;
       }
       else if(major.equalsIgnoreCase("Business"))
       {
           return business;
       }
       return history;

        */

        return STEM;
    }

    public  String evaluateSchoolMajor(CollegeUni greatSc, int studentsType) //KEY POINT
    {
        String[] greatSchools = greatSc.getGreatSchools();
        String[] stemngreat = new String[30]; // STEM and Great
        String hold = "\n";

        if (majorEv().equals(STEM) && studentsType == 3) //the major the student inserted MUST match STEM, and they MUST
            //have a school type score of 3; being the most competitive schools.
        {
            int count = 0;
            for (int j = 0; j < greatSchools.length; j++)
            {
                //for each value in correct letters.
                for (int y = 0; y < STEM.length; y++)
                {
                    //for each letter in the word
                    if (greatSchools[j].equals(STEM[y]))
                    {
                        stemngreat[j] = greatSchools[y];
                    }
                }
            }
            for (int n = 0; n < stemngreat.length; n++)
            {
                if (stemngreat[n] != null)
                {
                    hold = hold + stemngreat[n] + ", \n"; //prints the schools each on a separate line
                }
            }
            return hold;
        }
        return hold;
    }
}