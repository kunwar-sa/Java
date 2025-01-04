import java.util.concurrent.atomic.AtomicInteger;

class Demo {

    static int x = 5;

    public static void main(String[] args) {

        increment();
        System.out.println(x);
    }

    public static void increment() {
        x++;
    }
}