public class if_else {
    public static void main(String[] args) {
      
        System.out.println("----------normal if else condition-------------");
        if(5 <4){
            System.out.println("greter");
    } else {
        System.out.println("smaller");
     }

     System.out.println();

     System.out.println("----------nested if else statment----------");
     if(5<4) {
        System.out.println("5 is greter");
     } else {
        if (7 > 8) {
            System.out.println("7 is greter ");
        } else {
            System.out.println("8 is greter");
        }
       
        }
    

   

    int age = 2;
    boolean licence = true;

    if(age>=18){
        if (licence) {
            System.out.println("you are eligible to drive");
        } else {
            System.out.println("your are legal age , but you dont have dl");
        }
    } else {
        System.out.println("you are too young to drive");
    }

}

}



