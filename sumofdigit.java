public class sumofdigit {
    public static void main(String[] args) {
        int n= 1538;
        int sum = 0;
        

        while(n>0){
            int digit = n%10;
            
             sum=sum+digit;
             n=n/10;
        }

        System.out.println(sum);

        System.out.println("===========================================================");

        int f= 1538;
        int rev = 0;
        

        while(n>0){
            int digit = f%10;
            
             rev = rev*10+digit;
             n=f/10;
        }

        System.out.println(rev);
    }
}
