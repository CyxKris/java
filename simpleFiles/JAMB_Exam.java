import java.util.Scanner;

class JAMB_Exam {
    int maths;
    int eng;
    int ict;
    int econs;
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

        System.out.println("\n\n GETTING YOUR TOTAL JAMB SCORE...\n\n ");
        total = maths + eng + ict + econs;
        avg = total / 4;

        System.out.println("Your total JAMB Score is: " + total);
        System.out.println("The average of your JAMB Score is: " + avg);

        // Using conditional statements
        if (avg <= 39) {
            System.out.println("\nYour grade is F. You failed!");
        } else if (avg <= 55) {
            System.out.println("\nYour grade is E. You failed!");
        } else if (avg <= 60) {
            System.out.println("\nYour grade is D. You sort of failed!");
        } else if (avg <= 65) {
            System.out.println("\nYour grade is C. You passed!");
        } else if (avg <= 89) {
            System.out.println("\nYour grade is B. You passed excellently!");
        } else if (avg >= 90) {
            System.out.println("\nYour grade is A. You passed exceptionally!");
        } else {
            System.out.println("\nError! Check your input, please.");
        }
    }

    public static void main(String[] args) {
        JAMB_Exam exam = new JAMB_Exam();
        exam.getScore();
    }
}

// !Assignment
// Create a grading system for a school.
