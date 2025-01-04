// Shared lock object for synchronization
class Lock {
    public static final Object lock = new Object();
}

class OddThread extends Thread {
    private int limit;

    // Constructor to set the limit for odd numbers
    public OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        // Print odd numbers
        for (int i = 1; i <= limit; i += 2) {
            synchronized (Lock.lock) {
                System.out.println(i + " is odd");
                Lock.lock.notify(); // Notify the even thread to proceed
                try {
                    if (i + 1 <= limit)
                        Lock.lock.wait(); // Wait until the even thread prints
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

class EvenThread extends Thread {
    private int limit;

    // Constructor to set the limit for even numbers
    public EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        // Print even numbers
        for (int i = 2; i <= limit; i += 2) {
            synchronized (Lock.lock) {
                System.out.println(i + " is even");
                Lock.lock.notify(); // Notify the odd thread to proceed
                try {
                    if (i + 1 <= limit)
                        Lock.lock.wait(); // Wait until the odd thread prints
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}

public class Multithreading {
    public static void main(String[] args) {
        int input = 10;

        // Create threads for odd and even numbers
        OddThread oddThread = new OddThread(input);
        EvenThread evenThread = new EvenThread(input);

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}
