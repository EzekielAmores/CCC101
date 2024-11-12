package Lab_Activities2;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("What operation would you like to perform [+ for addition, - for subtraction, * for multiplication, / for division]: ");
        String operation = input.nextLine();

        float[] x;
        float n;

        switch (operation) {
            case "+":
                x = Input(input);
                n = x[0] + x[1];
                System.out.println("Result: " + n);
                break;
            case "-":
                x = Input(input);
                n = x[0] - x[1];
                System.out.println("Result: " + n);
                break;
            case "*":
                x = Input(input);
                n = x[0] * x[1];
                System.out.println("Result: " + n);
                break;
            case "/":
                x = Input(input);
                n = x[0] / x[1];
                System.out.println("Result: " + n);
                break;
            default:
                System.out.println("Invalid Input");
                break;
                    
        }
    }

    static float[] Input(Scanner input){
        System.out.print("Choose your first number: ");
        float i1 = input.nextFloat();
        System.out.print("Choose your second number: ");
        float i2 = input.nextFloat();
        float[] i = {i1, i2};
        return i;
    }
}