package arry;

class arry {
    public static void main(String[] args) {
        
        int[] x = new int[5];

        x[0] = 100;
        x[1] = 200;
        x[2] = 300;
        x[3] = 400;
        x[4] = 500;

        //int i=0;
        //for(i=0;i < x. length;i++){
           // System.out.println(x[i]);
        //}

        System.out.println("Accessing Through ");
        for(int i :x){
             System.out.println(i);
        }
    }
}