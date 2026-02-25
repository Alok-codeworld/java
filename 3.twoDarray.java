package arry;

 class TwoDArray {
    public static void main(String[] args) {
        // Declaration and Allocation of 3x3 2D Array
        int[][] x = new int[3][3];

        // Assigning values
        x[0][0] = 1;
        x[0][1] = 2;
        x[0][2] = 3;

        x[1][0] = 4;
        x[1][1] = 5;
        x[1][2] = 6;

        x[2][0] = 7;
        x[2][1] = 8;
        x[2][2] = 9;

        // You could also do:
        // int[][] matrix = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };
        
        System.out.println(" Length of Row "+x.length);
        System.out.println(" Length of column " + x[0].length);
        System.out.println("=====================");
        
        System.out.println("Accessing 2D Array Through Index:");
        System.out.println("Element at [1][2] = " + x[1][2]);  // Output: 6
        System.out.println("=====================");

        System.out.println("Accessing 2D Array Through Nested For-Loop:");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=====================");

        System.out.println("Accessing 2D Array Through Enhanced For-Loop:");
        for (int[] row : x) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        
    }
}