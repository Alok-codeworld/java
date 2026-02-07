public class bitwiseopretor {
    public static void main(String[] args) {
         int x=12;
        int y= 9 ;
        int resultAnd = x & y;
        System.out.println("Bitwise AND:" + resultAnd); 

        int resultOR = x|y;
        System.out.println("bitwise OR:" + resultOR);

        int resultXor = x ^ y;
        System.out.println("bitwise xor:"+ resultXor);

        x=5;
        int resultNotX = ~x;

        x=12;
        int resultleftShift = x<< 2;
        System.out.println("leftshift:" + resultleftShift );

        int resultRightshift = x>> 2;
        System.out.println("Right shift:" + resultRightshift);
    }
}
