package final_exam;

import java.util.Scanner;

public class courses {
    public static void main(String[] args) {
        // Variables
        String courseID;
        String course_name = "";
        int tuition = 0;

        Scanner scanner = new Scanner(System.in);

        //  input the CourseID
        System.out.println("Enter CourseID: ");
        courseID = scanner.nextLine().toUpperCase();

        // course details
        switch (courseID) {
            case "BSE":
                course_name = "Software Engineering";
                tuition = 900000;
                break;
            case "BIT":
                course_name = "Information Technology";
                tuition = 750000;
                break;
            case "BCS":
                course_name = "Computer Science";
                tuition = 800000;
                break;
            case "BCE":
                course_name = "Computer Engineering";
                tuition = 950000;
                break;
            default:
                System.out.println("Wrong CourseID details");
                System.exit(0);
        }

        // to course details
        System.out.println("Course Name: " + course_name);
        System.out.println("Tuition: " + tuition);
    }
}
