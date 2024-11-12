package Lab_Activities2;
import java.util.Scanner;

public class BankingSystemSoloLoop {

    static float balance;

    static boolean _isRunning = true;

    public static void main(String[] args){
        while (_isRunning){
            update();
        }
    }

    // New method
    public static void update(){
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to deposit, withdraw or check your balance [D - deposit, W - withdraw, C - Check balance]: ");
        String in = input.nextLine();

        float result;

        switch (in.toUpperCase()) {
            case "D":
                System.out.print("how much would you like to deposit: ");
                result = input.nextFloat();
                balance += result; // Equivalent to "balance = balance + result"
                System.out.println("Your current balance: P" + balance);
                again();
                break;
            case "W":
                System.out.print("how much would you like to withdraw: ");
                result = input.nextFloat();
                if (result > balance){
                    System.out.println("Insufficient funds");
                    break;
                }
                balance -= result; // Equivalent to "balance = balance + result"
                System.out.println("Your current balance: P" + balance);
                again();
                break;
            case "C":
                System.out.println("Your current balance: P" + balance);
                again();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        input.reset(); // yava naa ra man diay ni.

        if (_isRunning == false){
            input.close();
        }
    }

    public static void again(){
        Scanner input = new Scanner(System.in);
        System.out.print("Would you like to try again [Y - Yes, N - No]: ");
        String in = input.nextLine();

        if (in.toUpperCase().equals("Y")){
            _isRunning = true;
        }else if (in.toUpperCase().equals("N")){
            _isRunning = false;
            input.close();
        }else{
            _isRunning = false;
            System.out.println("Invalid Input");
            input.close();
        }

        input.reset();
    }
}
