package mutiplethread;

class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable Child Thread: " + i);
        }
    }
}

class ImplementingRunnable {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);  // Pass Runnable object to Thread
        t1.start();
        // t1.run();

        for(int i = 1; i <= 5; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}


// CMD - javap java.lang.Runnableclass implementthread {
