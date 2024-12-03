import java.util.Scanner;

    public class StudentGradeCalculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for the number of subjects
            System.out.print("Enter the number of subjects: ");
            int numSubjects = scanner.nextInt();

            // Array to store marks of each subject
            int[] marks = new int[numSubjects];
            int totalMarks = 0;

            // Input marks for each subject
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
                marks[i] = scanner.nextInt();

                // Validate marks input
                if (marks[i] < 0 || marks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    i--; // Decrement index to re-enter marks
                    continue;
                }
                totalMarks += marks[i];
            }

            // Calculate average percentage
            double averagePercentage = (double) totalMarks / numSubjects;

            // Determine grade based on average percentage
            char grade;
            if (averagePercentage >= 90) {
                grade = 'A';
            } else if (averagePercentage >= 80) {
                grade = 'B';
            } else if (averagePercentage >= 70) {
                grade = 'C';
            } else if (averagePercentage >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display results
            System.out.println("\n----- Results -----");
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
            System.out.println("Grade: " + grade);

            scanner.close();
        }
    }

