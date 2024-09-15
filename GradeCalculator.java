import java.util.Scanner;

public class GradeCalculator 
{

    public static void main(String[] args) 
{
        Scanner scanner = new Scanner(System.in);
        
        // Get the weights for each component
        final double ASSIGNMENT_WEIGHT = 0.4; // 40%
        final double MIDTERM_WEIGHT = 0.25; // 25%
        final double FINAL_EXAM_WEIGHT = 0.35; // 35%
        
        // Get the scores from the user
        System.out.print("Enter the assignment score (0-100): ");
        double assignmentScore = scanner.nextDouble();
        
        System.out.print("Enter the midterm score (0-100): ");
        double midtermScore = scanner.nextDouble();
        
        System.out.print("Enter the final exam score (0-100): ");
        double finalExamScore = scanner.nextDouble();
        
        // Validate the input scores
        if (assignmentScore < 0 || assignmentScore > 100 ||
            midtermScore < 0 || midtermScore > 100 ||
            finalExamScore < 0 || finalExamScore > 100) {
            System.out.println("Error: Scores must be between 0 and 100.");
            return;
        }
        
        // Calculate the weighted average
        double finalGrade = (assignmentScore * ASSIGNMENT_WEIGHT) +
                            (midtermScore * MIDTERM_WEIGHT) +
                            (finalExamScore * FINAL_EXAM_WEIGHT);
        
        // Print the final grade
        System.out.printf("The final grade is: %.2f\n", finalGrade);
        
        // Determine the letter grade
        char letterGrade;
        if (finalGrade >= 90) {
            letterGrade = 'A';
        } else if (finalGrade >= 80) {
            letterGrade = 'B';
        } else if (finalGrade >= 70) {
            letterGrade = 'C';
        } else if (finalGrade >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }
        
        // Print the letter grade
        System.out.println("The letter grade is: " + letterGrade);
        
        scanner.close();
    }
}
