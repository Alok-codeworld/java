package arry;

import java.util.Scanner;

class TwoDcharArrayInput {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object

        // Step 1: Ask for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: Create 2D char array
        char[][] grid = new char[rows][cols];

        // Step 3: Input elements
        System.out.println("Enter the characters of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at (" + i + "," + j + "): ");
                grid[i][j] = sc.next().charAt(0); // Take first character of input
            }
        }

       
        // Step 4: Print the 2D char array
        System.out.println("\nThe 2D char array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();  // new line after each row
        }

        sc.close();  // Close the scanner
     }
}
