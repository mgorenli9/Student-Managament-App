import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    // constructor: prompt user to enter student's name and year
    public Student(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student first name:");
        this.firstName = input.nextLine();

        System.out.print("Enter student last name:");
        this.lastName = input.nextLine();

        System.out.print("1- Freshmen\n2- Sophmore\n3- Junior\n4- Senior\nEnter student grade year:");
        this.gradeYear = input.nextInt();

        setStudentID();
    }
    // Generate an id for each student
    private void setStudentID(){
        id++;
        this.studentID= gradeYear + "" +id;
    }
    //Enroll the courses
    public void enroll(){

        do {
              System.out.print("Enter course to enroll (Q to quit): ");
              Scanner input = new Scanner(System.in);
              String course = input.nextLine();
              if(!course.equals("Q")){
                 courses = courses +"\n  "+ course;
                 tuitionBalance = tuitionBalance + costOfCourse;
              }
              else {
                  System.out.println("Enroll is completed!");
                  break;
              }
        }while (1 != 0);

        System.out.println("Enrolled in : " + courses);

    }
    //View balance
    public void viewBalance(){
        System.out.println("Your balance is TL "+tuitionBalance);
    }
    // pay tuition
    public void payTuition(){
        viewBalance();
        System.out.print("Enter your payment TL : ");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of TL "+payment);
        viewBalance();
    }
    // show status
    public String showInfo(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear+
                "\nStudent ID: " + studentID +
                "\nEnrolled Classes: " + courses +
                "\nBalance: " + tuitionBalance;
    }
}
