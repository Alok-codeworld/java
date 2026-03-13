package Interface;


interface Student {
    void getMarks();
    void calculateTotal();
    void calculatePercentage();
}


class Result implements Student {

    int hindi = 85;
    int english = 78;
    int marathi = 90;
    

    int total;
    double percentage;

       public void getMarks() {
        System.out.println("Marks of 6 Subjects:");
        System.out.println("  HINDI = "+hindi + " || Marathi = " + marathi + " || english = " + english  );
    }

    public void calculateTotal() {
        total = hindi + marathi + english ;
        System.out.println("Total Marks = " + total);
    }

    public void calculatePercentage() {
        percentage = (total / 300.0) * 100;
        System.out.println("Percentage = " + percentage + "%");
    }
}


public class Main {
    public static void main(String[] args) {
        Result r = new Result();
        r.getMarks();
        r.calculateTotal();
        r.calculatePercentage();
    }
}