package phase1.PracticeProject12;
//Write a program in Java to demonstrate sleep() and wait()

public class MyTest {
    public static void main(String[] args) {
        final Object lock = new Object();

        // Thread using sleep()
        Thread sleepThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Sleeping thread is about to sleep.");
                try {
                    Thread.sleep(3000); // Sleep for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Sleeping thread woke up.");
            }
        });

        // Thread using wait()
        Thread waitThread = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Waiting thread is waiting.");
                try {
                    lock.wait(3000); // Wait for 3 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Waiting thread is done waiting.");
            }
        });

        sleepThread.start();
        waitThread.start();
    }
}

