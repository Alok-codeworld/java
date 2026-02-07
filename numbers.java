class numbers {
    public static void main(String[] args) {
     int n = 6;
     for (int i = 2; i < n; i++) {
         if (n %i==0 && i%n ==0){
            System.out.println(" not Prime number");
             break;
            
            }else
            System.out.println("yes its prime number");
             break;
    }
        
    }
}
