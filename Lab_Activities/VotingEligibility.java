// Name: Ezekiel L. Amores
// Course: BS Information System

// import Scanner library
import java.util.Scanner;

// main class
public class VotingEligibility {

    // main method
    public static void main(String[] args) {
        // Create new Scanner named input
        Scanner input = new Scanner(System.in);

        // prints out text asking your name
        System.out.print("What is your name: ");
        // gets input as string
        String name = input.nextLine();

        // prints out a greeting
        System.out.printf("Hello %s! %n", name); // %n is for new line

        // prints out text asking your age
        System.out.print("How old are you: ");
        // gets input as int
        int age = input.nextInt();

        // conditional statements
        if (age >= 18 && age < 122)
            // if age is above 18, then print "eligible to vote"
            System.out.printf("%s is eligible to vote!", name);
        else if (0 < age && age < 18)
            // if age is below 18, then print "not eligible to vote"
            System.out.printf("%s is not eligible to vote!", name);
        else if (age >= 122)
            // BONUS Easter Egg: if age is above 122, then the user is now the oldest person in the world.
            System.out.println("You've surpassed the oldest person in the world!");
        else
            // BONUS Easter Egg: if age is below 0, then the user is not even been born yet.
            System.out.println("You are not yet alive.");
        
        // Closes Scanner(System.in) to avoid resource leak.
        input.close();
    }
}
