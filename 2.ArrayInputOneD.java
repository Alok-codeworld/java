  package arry;

  import java.util.Scanner;
 
class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();  // Take size of array

        int[] arr = new int[size];  // Create array of given size

        System.out.println("Enter " + size + " elements:");

        // Input values using a loop
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  // Take input for each element
        }

        // Display the array
        System.out.println("The array elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();  // Close the scanner
    }
} 
