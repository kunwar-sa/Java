
public class Table {

    public void tab() {

        for (int i = 1; i <= 7; i++) {

            for (int n = 1; n <= 5; n++) {
                System.out.println(i * n);
            }
            System.out.println("_______");
        }
    }

    public void tabs() {

        for (int i = 7; i >= 1; i--) {

            for (int n = 5; n >= 1; n--) {
                System.out.println(i * n);
            }
            System.out.println("_______");
        }

    }

    public static void main(String[] args) {
        Table obj = new Table();
        obj.tab();
        obj.tabs();

    }

}
