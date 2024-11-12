package Lab_Activities2;
import java.util.Scanner;

public class BankingSystemSolo {

    static float balance;

    public static void main(String[] args){
        update();
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
                update();
                break;
            case "W":
                System.out.print("how much would you like to withdraw: ");
                result = input.nextFloat();
                if (result > balance){
                    System.out.println("Insufficient funds");
                    update();
                    break;
                }
                balance -= result; // Equivalent to "balance = balance + result"
                System.out.println("Your current balance: P" + balance);
                update();
                break;
            case "C":
                System.out.println("Your current balance: P" + balance);
                update();
                break;
            default:
                System.out.println("Invalid Input");
                update();
                break;
        }

        input.close();
    }
}
