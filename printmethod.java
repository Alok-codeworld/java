 class printmethod {

    void areas(){
        System.out.println("Nothing to print");
    }

    void area(float r){
        double pi = 3.14*r*r;
       System.out.println("circle area = " + pi);
    }

    void areass(int r){
        int square = r*r;
        System.out.println("area of square =" + square);
    }

    void arear(int x, int y){
        int rectangular = x*y;
        System.out.println("rectangular of = " + rectangular);
    }

    void areac(int x , int y , int z){
        double cuboid = x*y*z;
        System.out.println("cuboid is = " + cuboid);
    }
    public static void main(String[] args) {
        printmethod p = new printmethod();
        p.areas();
        p.area(2);
        p.areass(22);
        p.arear(22, 44);
        p.areac(6, 8, 12);
    }
}