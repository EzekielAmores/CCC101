package Lab_Activities3;

import java.util.Scanner;

public class threeInOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Which task would you like to perform? \n 1. Get number\n 2. Get character\n 3. Get greatest number\n : ");
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
        String _char = input.nextLine();

        if (_char.length() > 1){
            System.out.println("Invalid input");
            return;
        }

        char character = _char.charAt(0);

        if (Character.isAlphabetic(character)){
            System.out.println("The character is in the alphabet");
        }else if (Character.isDigit(character)){
            System.out.println("The character is a number");
        }else{
            System.out.println("The character is a special character");
        }
    }

    public static void getGreatestNumber(){
        Scanner input = new Scanner(System.in);
        int[] arr = new int[3];

        System.out.print("Input 1st number: ");
        arr[0] = input.nextInt();
        System.out.print("Input 2nd number: ");
        arr[1] = input.nextInt();
        System.out.print("Input 3rd number: ");
        arr[2] = input.nextInt();

        // int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < 3; i++){
            // if(min > arr[i]){
            //     min = arr[i];
            // }
            if(max < arr[i]){
                max = arr[i];
            }
        }

        System.out.println("The greatest number is " + max);
    }
}
