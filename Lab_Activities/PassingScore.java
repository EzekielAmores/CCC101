// Name: Ezekiel L. Amores
// Course: BS Information System

// import Scanner library
import java.util.Scanner;

// Main class
public class PassingScore{
    
    // main method
    public static void main(String[] args){
        // Create new Scanner named input
        Scanner input = new Scanner(System.in);
        
        // prints out text asking your name
        System.out.print("What is your name: ");
        // gets input as string
        String name = input.nextLine();

        // prints out a greeting
        System.out.printf("Hello %s! %n", name); // %n is for new line

        // prints out text asking for your score
        System.out.print("What is your score: ");
        // gets input as int
        int score = input.nextInt();

        // conditional statements
        if (score >= 60 && score <= 100)
            // if score is above 60, then print "passed"
            System.out.printf("%s passed the test!", name);
        else if (0 <= score && score < 60)
            // if score is below 60, then print "did not pass"
            System.out.printf("%s did not pass the test!", name);
        else if (score > 100)
            // BONUS Easter Egg: if score is above 100, then the user is too smart.
            System.out.println("You've exceed the possible score!");
        else
            // BONUS Easter Egg: if score is below 0, then it's impossible.
            System.out.println("It's not possible to reach a negative score");
        
        // Closes Scanner(System.in) to avoid resource leak.
        input.close();
    }
}