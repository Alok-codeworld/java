public class logicoprator {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean resultAnd = x && y;
        System.out.println("logic AND :" + resultAnd);

        boolean resultOr = x || y ;
        System.out.println("Logical OR:" + resultOr);

        boolean resultNotX = !x;
        boolean resultNoty = !y;
        System.out.println("Logical NOT for x : " + resultNotX);
        System.out.println("Logical Not for y:" + resultNoty);
    }
}
