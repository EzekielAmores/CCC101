package Lab_Activities3;

import java.util.Scanner;

public class threeInOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Which task would you like to perform? \n 1. Get number\n 2. Get character\n 3. Get greatest number");
        int option = input.nextInt();

        switch (option) {
            case 1:
                getNumber();
                break;
            case 2:
                getCharacter();
                break;
            case 3:
                getGreatestNumber();
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input number: ");
        int number = input.nextInt();

        if (number > 0){
            System.out.println("The number is positive");
        }else if (number == 0){
            System.out.println("The number is zero");
        }else if (number < 0){
            System.out.println("The number is negative");
        }

        input.close();
    }

    public static void getCharacter(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input character: ");
        char character = input.nextLine().charAt(0);
    }

    public static void getGreatestNumber(){

    }
}
