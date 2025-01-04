public class Java14Features {

    public static void main(String[] args) {
        testSwitchCase();
    }

    public static void testRecords() {
        record Point(int x, int y) {
        }
        Point p = new Point(4, 7);
        System.out.println(p);
    }

    public static void testTextBlock() {
        String json = """
                {
                    name: Prakhar,
                    age: 27
                }
                """;
        System.out.println(json);
    }

    public static void testSwitchCase() {
        int day = 7;
        String weekday = switch (day) {
            case 1, 2, 3, 4, 5 -> "weekday";
            case 6, 7 -> "weekend";
            default -> throw new IllegalArgumentException();
        };
        System.out.println(weekday);

    }

    public static void testInstanceOf() {
        Object obj = "Prakhar";
        if (obj instanceof String str)
            System.out.println(str);
    }
}
