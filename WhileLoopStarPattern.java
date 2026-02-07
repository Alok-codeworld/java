public class WhileLoopStarPattern {
    public static void main(String[] args) {
       /*  int rows = 5;
        int i = 1; 

        while (i <= rows) {
            int j = 1; 
            while (j <= i) {
                System.out.print("* "); 
                j++; 
            }
            System.out.println(); 
            i++; 
    }

    System.out.println("-------reverse * ------------");
       int row = 5;
        int a = 1; 

        while (a <= 4) {
            int j = 1; 
            while (j >= a) {
                System.out.print("*"); 
                j++; 
            }
            System.out.println(); 
            a++; 
    }
    System.out.println("-------123--------");*/
    
    /*int s=8;
    
        while(1<=s){
              int j=1;j++;
          while(1<=j){
              int x=1; 
          System.out.print((j));
          i++;
        }
        System.out.println();
    }*/
    /*System.out.println("");
        int k=1;
        while(k<=5){
           int l=1;
           while(l<=i){
            System.out.print("*");
            System.out.print("");
            l++;
           }
           System.out.println(" ");
           i++;
        }*/

         int n = 5; 
        int i = n;

        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

        System.out.println("-------square----------");
    
        int s = 4;   
        int k = 1;

        while (k <= s) {
            int j = 1;

            while (j <= s) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            k++;
        }
    
        System.out.println("--------- *------------------");
  
        n=4;
        for(int q=1; q<=4; q++){
            System.out.println(" ". repeat(n-q)+"*". repeat(q));
        }
        System.out.println();

       System.out.println("------------");

       
       
       n=8;
       for(int d=1; d<=8; d++){
        System.out.println("".repeat(n+d)+"*".repeat(d));
       }
       System.out.println();

     System.out.println(".................................................");

       n=5;
       for(int m=1; m<=5; m++){
        System.out.println(" ".repeat(n-m)+"*".repeat(n));
       }
       System.out.println();

      System.out.println(".................................................");

       n=5;
       for(int m=1; m<=5; m++){
        System.out.println(" ".repeat(n+m)+"*".repeat(n));
       }
       System.out.println();

     System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

      int r = 5;

        for (int o = 1; o <= r; o++) {
            for (int p = 1; p <= r; p++) {

                if (o == 1 || o == r || p == 1 || p == r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    
        System.out.println("-------------------------------");
       
            int x= 4;

            for(int o = 1; o <= x; o++ ) {

                for(int j=o; j < x; j++){
                   System.out.print(" ");
                }

                for(int u= 1;u<=o; u++){
                    System.out.print(" *");
                }

               System.out.println(); 
            }

            System.out.println("---------------------");
 
             int z= 4;

            for(int o = 0; o <= z; o++ ) {

                for(int j=1; j > z; j--){
                   System.out.print(" ");
                }

                for(int u = 5;u >=o; u--){
                    System.out.print(" *");
                }

               System.out.println(); 
            }
         
            System.out.println("------------------------");

             int l= 5;

            for(int o = 1; o <= l; o++ ) {

                for(int j=o; j < l; j++){
                   System.out.print(" ");
                }

                for(int u= 1;u<=o; u++){
                    System.out.print(" *");
                }

                 if (l == 0 || 1 == o|| o == 3 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }


               System.out.println(); 
            }

            System.out.println("--------------------");

        n=6;
        for(int q=1; q<=6; q++){
            System.out.println(" ". repeat(n+q)+"*". repeat(q));
        }
        for(int j=1; j < x; j++){
                   System.out.print(" ");
                }

               System.out.println();
            
        }
    }


        
    








