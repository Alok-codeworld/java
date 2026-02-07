import java.util.Scanner;

class if_else_ {
    public static void main(String[] args) {
        
        System.out.println("---------1. elif statement----------");
        if ( 5 < 4){
          System.out.println("5 is greter");
    } else if (4 >3){
        System.out.println("4 is greter");
    } else if ( 6 > 7) {
        System.out.println("6 is smaller");
    } else {
        System.out.println("7 is greter");
    }

    System.out.println();
    int grade = 85;

    if ( grade > 90) {
        System.out.println(" grade is a");
    } else if ( grade > 80){
        System.out.println("grade is b");
    } else if ( grade > 74){
        System.out.println("grade is c");
    } else {
        System.out.println( " grade is d");
    }

    System.out.println();
    
    System.out.println("---------- odd even number -----------");
    int number = 4;

    if (number > 2){
        System.out.println("even number");
    } else if ( number < 5){
        System.out.println("odd number");
    } 
     
    System.out.println();


     Scanner sc = new Scanner(System.in);

   System.out.print(": ");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println("This is an odd number");
        } else {
            System.out.println("This is not an odd number");
        }

        sc.close();
    }
    


    
}

