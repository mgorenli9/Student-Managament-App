import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //ask how many new students we  want to add
        System.out.print("Enter number of new students  to enroll: ");
        Scanner input = new Scanner(System.in);
        int numOfStudents = input.nextInt();
        Student[] students = new Student[numOfStudents];

        //Create n number of new students
        for(int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        System.out.println("\nEnrolled Students:\n");
        for(int n = 0; n < numOfStudents; n++){
            System.out.println("Student " + (n+1));
            System.out.println(students[n].showInfo());
            System.out.print("\n");
        }

    }
}