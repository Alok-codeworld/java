 class palindrome {
    public static void main(String[] args) {
         int n= 121;
        int sum = 0;
        int temp=n;
        

         while(n>0){
            int r = n%10;
             n=n/10;
             sum = sum*10+r;

            }
           
        
        if(sum==temp){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palindrome");
        }
           
    }
}