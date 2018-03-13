import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        int minScore = 100;
        int maxScore = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();
            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount++;
                scoreTotal += testScore;
                maxScore= Math.max(testScore,maxScore);
            	minScore= Math.min(testScore,minScore);
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }
        double averageScore = (double) scoreTotal / scoreCount;
        NumberFormat num = NumberFormat.getNumberInstance();
        num.setMaximumFractionDigits(1);
        String AverageScoreString = num.format(averageScore);
        // display the score count, score total, and average score
        
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + AverageScoreString + "\n"
                + "Max Score:     " + maxScore + "\n"
                + "Min Score:     " + minScore;
        System.out.println(message);
    }
}