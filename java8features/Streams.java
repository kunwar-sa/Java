import java.util.*;
import java.util.stream.*;

public class Streams {

    // Find duplicate elements in a list
    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 6));
        System.out.println(li);

        li = li.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet()
                .stream().filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList());

        System.out.println(li);

    }
}
