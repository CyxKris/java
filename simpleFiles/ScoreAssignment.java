import java.util.Scanner;

public class ScoreAssignment {

    int maths;
    int eng;
    int ict;
    int econs;
    int chem;
    int bio;
    int phys;
    int civ;
    int total;
    int avg;

    Scanner input = new Scanner(System.in);

    void getScore() {
        System.out.println("Input your Mathematics score: ");
        maths = input.nextInt();

        System.out.println("\nInput your English score: ");
        eng = input.nextInt();

        System.out.println("\nInput your ICT score: ");
        ict = input.nextInt();

        System.out.println("\nInput your Economics score: ");
        econs = input.nextInt();

        System.out.println("\nInput your Chemistry score: ");
        chem = input.nextInt();

        System.out.println("\nInput your Biology score: ");
        bio = input.nextInt();

        System.out.println("\nInput your Physics score: ");
        phys = input.nextInt();

        System.out.println("\nInput your Civic Education score: ");
        civ = input.nextInt();

        System.out.println("\n\n GETTING YOUR TOTAL SCORE...\n\n ");
        total = maths + eng + ict + econs + chem + bio + phys + civ;
        avg = total / 8;

        System.out.println("Your total score is: " + total);
        System.out.println("Your average is: " + avg);

        // Using conditional statements
        if (avg <= 39) {
            System.out.println("\nYour grade is F. You failed!");
        } else if (avg <= 55) {
            System.out.println("\nYour grade is E. You failed!");
        } else if (avg <= 60) {
            System.out.println("\nYour grade is D. You sort of failed!");
        } else if (avg <= 65) {
            System.out.println("\nYour grade is C. You passed!");
        } else if (avg <= 75) {
            System.out.println("\nYour grade is B. You passed!");
        }  else if (avg <= 80) {
            System.out.println("\nYour grade is A. You passed excellently!");
        } else if (avg >= 90) {
            System.out.println("\nYour grade is A+. You passed exceptionally!");
        } else {
            System.out.println("\nError! Check your input, please.");
        }
    }

    public static void main(String[] args) {
        ScoreAssignment scores = new ScoreAssignment();
        scores.getScore();
    }
}
