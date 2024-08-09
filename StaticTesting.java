public class StaticTesting {
    
    static int a = 5;


    public static void hi() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        StaticTesting obj = new StaticTesting();
        StaticTesting.a = 6;
        System.out.println(obj.a);    
    
    }
}


