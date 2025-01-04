import java.util.*;

public class NullPointer {

    public static void main(String[] args) {
        testOptional();
    }

    public static void testOptional() {
        Optional<String> name = Optional.ofNullable(null);
        System.out.println(name.orElse("Prakhar"));
    }

    public static void requireNonNull() {
        String data = "Prakhar";
        String data2 = null;
        Objects.requireNonNull(data, "Input data cannot be null");
        System.out.println(data.toUpperCase());
    }
}
