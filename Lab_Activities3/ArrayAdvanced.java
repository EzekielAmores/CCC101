package Lab_Activities3;

import java.util.Scanner;

public class ArrayAdvanced {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int[] arr = new int[10];

        // Input 10 array values
        for (int i = 0; i < 10; i++){
            System.out.print("Set value to array index " + i + ": ");
            arr[i] = input.nextInt();
        }
        
        // Perform Task
        System.out.print("Which task would you like to perform? \n 1. Sort array\n 2. Search array value\n 3. Reverse array\n 4. Insert value to array\n 5. Remove array element\n : ");
        int option = input.nextInt();

        switch (option) {
            case 1:
                sortArray(arr);
                break;
            case 2:
                findValue(arr);
                break;
            case 3:
                reverseArray(arr);
                break;
            case 4:
                insertValue(arr);
                break;
            case 5:
                deleteValue(arr);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void sortArray(int[] arr){
        int size = arr.length;

        for (int i = 0; i < size - 1; i++){
        
            for (int j = 0; j < size - i - 1; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String currentArr = "(";

        for (int i = 0; i < size; i++){
            if (i == size - 1){
                currentArr += arr[i] + ")";
                break;
            }
            currentArr += arr[i] + ", "; 
        }

        System.out.println("Sorted array (Ascending): " + currentArr);
    }

    public static void findValue(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value you want to find: ");
        int value = input.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (value == arr[i]){
                System.out.println("The element is found in index " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }

    public static void reverseArray(int[] arr){
        for (int i = 0; i < 5; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        String currentArr = "(";

        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                currentArr += arr[i] + ")";
                break;
            }
            currentArr += arr[i] + ", "; 
        }

        System.out.println("Reverse array: " + currentArr);
    }

    public static void insertValue(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.print("Value you want to insert: ");
        int value = input.nextInt();

        System.out.print("Position you want to place it: ");
        int position = input.nextInt();

        if (position < 0 && position >= arr.length){
            System.out.println("Invalid Position");
            return;
        }

        for (int i = arr.length - 1; i >= 0; i--){
            if (i > position){
                arr[i] = arr[i - 1];
            }else if (i == position){
                arr[i] = value;
            }
        }

        String currentArr = "(";

        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                currentArr += arr[i] + ")";
                break;
            }
            currentArr += arr[i] + ", "; 
        }

        System.out.println("New array: " + currentArr);
        
    }

    public static void deleteValue(int[] arr){

        Scanner input = new Scanner(System.in);
        System.out.print("Remove element at index: ");
        int position = input.nextInt();

        if (position < 0 && position >= arr.length){
            System.out.println("Invalid Position");
            return;
        }

        for (int i = 0; i < arr.length; i++){
            if (i >= position){
                if (i == arr.length - 1){
                    arr[i] = 0;
                    break;
                }
                arr[i] = arr[i + 1];
            }
        }

        String currentArr = "(";

        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                currentArr += arr[i] + ")";
                break;
            }
            currentArr += arr[i] + ", "; 
        }

        System.out.println("New array: " + currentArr);
    }
}
