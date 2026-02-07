 class forloop {
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer loop");

            for (int j = 1; j<4; j++){
               
                System.out.println("inner loop");

                for ( int k=1;k<3;k++){
                    System.out.println("inside k loop ");
                }
            }
            System.out.println("another loop being");
        }

        System.out.println("loop begin");

        System.out.println("--------------- 4 table loop --------------------");
       

        int n = 4;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

       
        System.out.println("-------------- 1 to 5 table-------------");

        int x = 5;
        
        for (int j=1; j <= x; j++){
            System.out.println("table of"+j);
          for (int i = 1; i <= 10; i++){
           System.out.println(j + "*" + i + "=" + (j*i));
        }
        
        }
        
        System.out.println("------*---------");

        int a=8;
        for(int j=1;j<=a;j++){

          for(int i=1; i<=j; i++){

          System.out.print("x");
          
        }
        System.out.println();
    }
      
    System.out.println("-------123--------");
    
    int s=8;
        for(int j=1;j<=s;j++){

          for(int i=1; i<=j; i++){

          System.out.print((j));
          
        }
        System.out.println();
    }
       
     System.out.println("----------112233---------------");

     int l=8;
        for(int j=1;j<=l;j++){

          for(int i=1; i<=j; i++){

          System.out.print((i));
          
        }
        System.out.println();
    }

    System.out.println("--------------reverse * ----------------------");

    int o=8;
        for(int e=1;e<=5;e--){

          for(int i=1; i<=5; i++){

          System.out.print( "   *");
          
        }
        System.out.println();
    }
    }
    }
       
    

