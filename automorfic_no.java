import java.util.*;
 class automorfic_no {
    public static void main(String[] args) {
        int n = 625;
        int temp = n;
       int count=0;
       int digit=0;
       int result=0;
        while(temp >0){
            count++;
            temp=temp/10;   }    
            temp = n;
              digit=n*n;
              result=digit%(int) Math.pow(10, count);
              
            

       
       if( n==result){
        System.out.println("it is automorfic Number");
       }else{
        System.out.println("it is not automorfic Number");
       }
    }
}
