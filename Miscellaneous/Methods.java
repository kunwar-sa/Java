public class Methods {

    public int sum(int n) {

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    public int americano(int a, int b) {
        int product = a * b;
        return product;
    }

    public int latte(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {

        Methods obj = new Methods();

        int americanoAns = obj.americano(2, 5);
        System.out.println(americanoAns);

        int latteAns = obj.latte(1, 2, 3);
        System.out.println(latteAns);
    }
}
