public class CollegeUni
{
    private  String[] greatSchools =
            {
            "University of California Los Angeles", "Stanford",
            "University of California Irvine", "University Southern California",
            "Occidental College", "Pomona College", "Claremont McKenna College",
            "California Institute of Technology"
            };
    private  String[] goodSchools =
            {
            "California State University Long Beach",
            "California Polytechnic State University", "San Diego State University",
            "University California Riverside", "UC Merced", "The Master’s University",
            "University of San Diego", "University of La Verne", "Pacific Union College",
            "La Sierra University"
            };
    private  String[] community =
            {
            "Fullerton City college", "Long Beach city college",
            "Mt. San Antonio College", "Palomar College",
            "De Anza College", "Orange Coast College"
            };
    private  int schoolType = 0;

    public CollegeUni()
    {
        //intentionally left null
    }

    public int schoolEvalute(double gpa, int rank, int SAT)
    {
        //School Type 1-3; 1 being community college
        //2 being a good school
        //3 being a great competitive school

        if (gpa == 2 ) //GPAScore that is above average == 2
        {

            if(rank == 2 || SAT == 2) //Great Rank == 1 Great SATScore == 2
            {
                schoolType = 3;
                return schoolType;
            }

        }
        else if (gpa == 1) // good/average GPAScore == 1
        {
            if(SAT == 2) //Great SAT Score
            {
                schoolType = 3;
                return schoolType;

            }
            else if (SAT == 1 || SAT == -1)
            {
                schoolType = 2;
                return schoolType;
            }
        }
        schoolType = 1;
        return schoolType;
    }

    public String[] getGreatSchools()
    {
        return greatSchools;
    }
}
