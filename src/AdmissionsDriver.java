import java.util.Scanner;
public class AdmissionsDriver
{
    public static void main(String[] args)
    {
        String welcome = "Welcome to Best-Pick! \nA program made to evaluate the " +
                "best undergraduate school in California for high-school seniors.   ";
        String endProgram = "Thank you for participating! Good luck on your educational journey :) <3 ";
        System.out.println(welcome);
        Scanner scan = new Scanner (System.in);
        System.out.println("What is your 12th grade GPA? Please enter: ");
        double gpa = scan.nextDouble();
        System.out.println("What was your SAT Score? If you did not want to submit enter -1. \nPlease Enter:");
        int SAT = scan.nextInt();
        System.out.println("What is your rank in your graduating class? Please enter: ");
        int rank = scan.nextInt();
        Student student1 = new Student (gpa, SAT, rank);
        Majors test = new Majors();
        CollegeUni test2 = new CollegeUni();
        System.out.println("Which category best fits the description of your desired major? " +
                "Please choose and enter one category: " +
                "\nSTEM\n" +
                "Visual Performing Arts/Creative Arts\n" +
                "Medical Field\n" +
                "Linguistics and Humanities\n" +
                "Business\n" +
                "History");
        scan.nextLine();
        test.setMajor(scan.nextLine());
        student1.setTypeScore(test2);
        student1.setSchools(test.evaluateSchoolMajor(test2, student1.getType()));
        System.out.println("The schools that best fit your major and academic achievements are: " +
                student1.getSchools());
        System.out.println(endProgram);
    }
}

