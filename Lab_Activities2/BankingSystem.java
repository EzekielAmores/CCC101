package Lab_Activities2;
// To Do
// - Bank Transfer

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankingSystem {

    static List<User> users = new ArrayList<User>();

    static User currentUser;

    static int currentUserValue;

    public static void main(String[] args){

        newUpdate();
        
    }

    public static void newUpdate(){
        Scanner _input = new Scanner(System.in);
        System.out.print("Would you like to Log In or Sign Up [L - Log In, S - Sign Up] [C - Check users]: ");
        String in = _input.nextLine();

        switch (in.toUpperCase()) {
            case "L":
                authenticate(); 
                break;
            case "S":
                createAccount();
                break;
            case "C":
                checkUsers();
                break;
            default:
                System.out.println("Invalid Input");
                newUpdate();
                break;
        }
    }

    public static void checkUsers(){
        if(users.size() == 0){
            System.out.println("There are no users. Please Sign Up.");
            // create accoung method
            newUpdate();
            return;
        }

        for(int i = 0; i < users.size(); i++){
            System.out.println("Username: " + users.get(i).username + " || Password: " + users.get(i).password + " || Balance: " + users.get(i).balance);
        }
        newUpdate();
    }

    public static void authenticate(){
        Scanner input = new Scanner(System.in);

        if(users.size() == 0){
            System.out.println("There are no users. Please Sign Up");
            // create accoung method
            newUpdate();
            return;
        }

        System.out.print("Enter your username: ");
        String user = input.nextLine();


        for(int i = 0; i < users.size(); i++){
            // System.out.println("Username: " + users.get(i).username + " || Password: " + users.get(i).password + " || Balance: " + users.get(i).balance);
            if (user.equals(users.get(i).username)){
                System.out.println("User found.");
                
                // get password
                System.out.print("Enter your password: ");
                String password = input.nextLine();

                if (password.equals(users.get(i).password)){
                    currentUserValue = i;
                    update();
                }else{
                    System.out.println("Na ligyas imong kamot? Please try again");
                    newUpdate();
                }
                return;
            }
        }

        System.out.println("No user found. Please try again");
        newUpdate();
    }

    public static void createAccount(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter new username: ");
        String username = input.nextLine();
        System.out.print("Enter new password: ");
        String password = input.nextLine();

        User newUser = new User(username, password);
        users.add(newUser);

        newUpdate();
    }

    // New method
    public static void update(){
        Scanner input = new Scanner(System.in);

        System.out.print("Would you like to deposit, withdraw or check your balance [D - deposit, W - withdraw, C - Check balance]: ");
        String in = input.nextLine();

        float result;

        float balance = users.get(currentUserValue).balance;

        switch (in.toUpperCase()) {
            case "D":
                System.out.print("how much would you like to deposit: ");
                result = input.nextFloat();
                balance += result; // Equivalent to "balance = balance + result"
                users.get(currentUserValue).balance = balance;
                System.out.println("Your current balance: P" + balance);
                newUpdate();
                break;
            case "W":
                System.out.print("how much would you like to withdraw: ");
                result = input.nextFloat();
                if (result > balance){
                    System.out.println("Insufficient funds");
                    newUpdate();
                    break;
                }
                balance -= result; // Equivalent to "balance = balance + result"
                users.get(currentUserValue).balance = balance;
                System.out.println("Your current balance: P" + balance);
                newUpdate();
                break;
            case "C":
                System.out.println("Your current balance: P" + balance);
                update();
                break;
            default:
                System.out.println("Invalid Input");
                newUpdate();
                break;
        }

        input.close();
    }
}

class User{
    String username;
    String password;
    float balance;

    User(String username, String password){
        this.username = username;
        this.password = password;
    }

    
}
