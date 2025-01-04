import java.util.*;
import java.util.stream.Collectors;

class Test {

    public static void main(String[] args) {
        String str = "Java concept of the day";
        String[] sarr = str.split("");

        Map<Object, Long> map = Arrays.stream(sarr).map(x -> x)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map.get("a"));

    }
}