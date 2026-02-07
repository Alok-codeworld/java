public class  ternarryopretor {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;

        int maxIFElse;
        if (a>b) {
            maxIFElse = a;
        }  else {
            maxIFElse = b;
        }
        System.out.println("using if-Else: the maximum value is:" + maxIFElse);

        int maxTernary = (a > b)? a:b;
        System.out.println("using ternary: the maximum value is:" + maxTernary);
    }
}
