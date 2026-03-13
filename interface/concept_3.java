package Interface;

 class parent {
    void parentMethod() {
          System.out.println("parent method");
    }
}

interface A {
       void m1();
    }

    class Child extends parent implements A {
        public  void m1() {
            System.out.println("Child: m1 implemented");
        }
    }

     class Concept_3{
     public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod();
        c.m1();
     }
    }


