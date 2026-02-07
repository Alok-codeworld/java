class reverseofdigit {
    public static void main(String[] args) {
        int n= 135;
        int sum = 0;
        

        while(n>0){
            int r = n%10;
             n=n/10;
             sum = sum*10+r;

            }
            System.out.print(sum);

       
    }
}
