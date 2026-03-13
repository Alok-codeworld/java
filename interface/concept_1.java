package Interface;

interface A {
    // public static final int VALUE=100;
    int VALUE = 100;   // constant (public static final)
}

class Demo implements A {
    void show() {
        System.out.println("VALUE = " + VALUE);
    }
}


public class Concept_1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();

        // A a = new A();      // Cannot create object of an Interface
    }
}
