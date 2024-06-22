import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double english, socialStudies, science, computer, totalMarks;
            String grade = "", name, rollNo;

            System.out.print("Enter Your Name: ");
            name = scanner.nextLine();
            System.out.print("Enter Your Roll No: ");
            rollNo = scanner.nextLine();
            System.out.println();

            System.out.println("______Marks Entry (Out of 100)______");
            english = getValidMarks(scanner, "English");
            socialStudies = getValidMarks(scanner, "Social Studies");
            science = getValidMarks(scanner, "Science");
            computer = getValidMarks(scanner, "Computer");
            System.out.println();

            totalMarks = english + socialStudies + science + computer;
            int average = (int) (totalMarks / 4);

            if (average > 90) {
                grade = "A+";
            } else if (average > 80) {
                grade = "A";
            } else if (average > 70) {
                grade = "B+";
            } else if (average > 60) {
                grade = "B";
            } else if (average > 50) {
                grade = "C+";
            } else if (average > 35) {
                grade = "C";
            } else {
                grade = "F";
            }

            System.out.println("_______Report Card:_______");
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNo);
            System.out.println();
            System.out.println("Total Marks: " + totalMarks + "/400");
            System.out.println("Average Marks: " + average);
            System.out.println("Grade: " + grade);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    private static double getValidMarks(Scanner scanner, String subject) {
        double marks;
        while (true) {
            System.out.print(subject + ": ");
            marks = scanner.nextDouble();
            if (marks >= 0 && marks <= 100) {
                break;
            } else {
                System.out.println("Please enter valid marks (0-100).");
            }
        }
        return marks;
    }
}
