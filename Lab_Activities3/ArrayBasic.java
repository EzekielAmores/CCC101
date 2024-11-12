package Lab_Activities3;
import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        // Input 10 array values
        for (int i = 0; i < 10; i++){
            System.out.print("Set value to array index " + i + ": ");
            arr[i] = input.nextInt();
        }

        // Perform Task
        System.out.print("Which task would you like to perform? \n 1. Display original array\n 2. Find Max and Min values\n 3. Find the average\n 4. Count elements above and below average\n : ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                displayArr(arr);
                break;
            case 2:
                findMinAndMax(arr);
                break;
            case 3:
                calculateAverage(arr);
                break;
            case 4:
                countElements(arr);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void displayArr(int[] arr){
        String output = "";

        for (int i = 0; i < arr.length; i++){
            if(i == 0){
                output += "(";
            }
            if(i == arr.length - 1){
                output += arr[i] + ")";
                break;
            }
            output += arr[i] + ", ";
        }

        System.out.println("Current Array Values");
        System.out.println(output);
    }

    public static void findMinAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }

        System.out.println("Minimum Value of array: " + min + ". Position: " + minIndex);
        System.out.println("Maximum Value of array: " + max + ". Position: " + maxIndex);
    }

    public static void calculateAverage(int[] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        int average = total / arr.length;

        System.out.println("Average of the array: " + average);
    }

    public static void countElements(int[] arr){
        int total = 0;

        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        int average = total / arr.length;

        String belowArr = "(";
        String aboveArr = "(";
        int belowCount = 0;
        int aboveCount = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < average){
                belowArr += arr[i] + ", ";
                belowCount++;
            }
            if (arr[i] > average){
                aboveArr += arr[i] + ", ";
                aboveCount++;
            }
        }

        belowArr = belowArr.substring(0, belowArr.length() - 2);
        belowArr += ")";
        aboveArr = aboveArr.substring(0, aboveArr.length() - 2);
        aboveArr += ")";
        
        System.out.println("Count of elements below average: " + belowCount);
        System.out.println("Count of elements above average: " + aboveCount);
    }
}
