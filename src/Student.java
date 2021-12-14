public class Student
{
    private  double gpa; //unweighted gpa of the student .
    private  int SAT; //SAT Score of the student
    private  int rank; //rank of the student in their graduate class
    private String name; //This variable will be used in the toString and called in future reform of program
    private String schools;
    private  int sSchoolType = 0;

    //constructor for the class student
    public Student(double gpa, int SAT, int rank)
    {
        this.gpa= gpa;
        this.SAT = SAT;
        this.rank = rank;
        this.sSchoolType = 0;
        this.schools = schools;
    }

    //getters
    public String getSchools()
    {
        return schools; //returns the schools that the student is eligible for
    }

    public int getType()
    {
        return sSchoolType; //gets the school type
    }

    //setters
    public void setTypeScore (CollegeUni c)
    {
        sSchoolType = c.schoolEvalute(GPAevalute(), SATScore(), ranking());//updates the School Type score.
        //The School type score being a score from 1-3, where 3 is competitive and low acceptance rate
        //type of schools, and 3 is community college.
    }

    public void setSchools(String m)
    {
    schools = m; //sets- updates the schools the student's major is a good program at
    // and has met the requirements to be accepted.
    }

    //The three brain methods:
    public int GPAevalute()
    {
        //This method will be concluding what kind of GPA this student has.
        // It can decide if it is good, bad, or above average/great.
        int returnGPA; //will be a number from 0-2, 0 being the worst and 2 being the best.
        if (gpa >= 3.0 && gpa <= 3.5)
        {
            returnGPA = 1;//good gpa
        }
        else if(gpa >= 3.6)
        {
            returnGPA = 2;// Very good/above average GPA
        }
        else
        {
            returnGPA = 0; //bad/below average GPA
        }
        return returnGPA;
    }

    public int ranking()
    {
        //This method will be concluding what kind of rank this student has.
        // It can decide if it is good, bad, or above average/great.
        int returnRank; // will return a number from 0-2 to determine if the ranking was bad, good, or above average.
        // 0 being worst and 2 being the best
        if (rank >= 1 && rank <= 25)
        {
            returnRank = 2;// really good ranking
        }
        else if(rank <= 120)
        {
            returnRank = 1;// good ranking
        }
        else
        {
            returnRank = 0; //bad ranking
        }
        return returnRank;
    }

    public int SATScore()
    {
        //This method will be concluding what kind of SAT Score this student has.
        // It can decide if it is good, bad, or above average/great.
        int returnSAT; // returnSAT will be a number from 0-2, 0 being the worst and 2 being the best.
        // However, this method has the option of returning -1 as well for those that do not want to submit

        if (SAT >= 1100 && SAT < 1300)
        {
            returnSAT = 1;//goodScore
        }
        else if(SAT >= 1300 && SAT <= 1600)
        {
            returnSAT = 2;//Very good score
        }
        else if(SAT == -1)
        {
            returnSAT = -1; //neutral score
        }
        else
        {
            returnSAT = 0; //bad score
        }
        return returnSAT;
    }

    //toString()
    public String toString()
    {
        String output = "";
        output += "\nName: " + name ; //outputs the name of student in future reforming of program
        return output;
    }
}
