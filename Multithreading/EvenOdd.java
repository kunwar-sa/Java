// Online Java Compiler
// Use this editor to write, compile and run your Java code online
/*
input  = 10
output -
1 is odd
2 is even
3 is odd
4 is even
*/

class EvenOdd {

    public static final Object lock = new Object();

    static class Even extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 != 0) {
                    synchronized (lock) {
                        try {
                            System.out.println(i + " is odd");
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.getMessage();
                        }
                    }
                }
            }
        }
    }

    static class Odd extends Thread {
        public void run() {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    synchronized (lock) {
                        try {
                            System.out.println(i + " is even");
                            lock.notify();
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.getMessage();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Even t1 = new Even();
        Odd t2 = new Odd();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Thread started");
    }
}
