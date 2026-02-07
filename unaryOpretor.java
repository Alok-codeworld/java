public class unaryOpretor {
    public static void main(String[] args) {
        int a = 5;

        int negative = -a;
        System.out.println("Unary minus (-a) :" + negative);

        int positive = +a;
        System.out.println("Unanry plus (+a):"+ positive);

        System.out.println("Original a :" + a);
        System.out.println("post-increment (a++):" + (a++));
        System.out.println("after post increment, a:" + a);

        System.out.println("pre-increment (++a)" + (++a));

        System.out.println("post-decrement (a--):" + (a--));
        System.out.println("after post-decrement, a:" + a);

        System.out.println("pre-decrement (--a):" + (--a));
    }
}
