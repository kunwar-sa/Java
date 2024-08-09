import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HMap {

    Map<String, Integer> map1 = new HashMap<>();
    Map<String, Integer> map2 = new HashMap<>();
    Map<String, Integer> map3 = new HashMap<>();
    Map<String, Integer> map4 = new HashMap<>();
    Map<String, Integer> map5 = new HashMap<>();


    HMap() {
        map1.put("Cristiano", 7);
        map1.put("Bale", 11);
        map1.put("Benzema", 9);

        map2.put("Messi", 10);
        map2.put("Suarez", 9);
        map2.put("Neymar", 11);

        map3.put("Zidane", 5);
        map3.put("Muller", 13);
        map3.put("Xavi", 6);

        map4.put("Cristiano", 12);
        map4.put("Bale", 11);
        map4.put("Benzema", 9);

        map5.put("Cristiano", 8);
        map5.put("Bale", 11);
        map5.put("Benzema", 9);
    }

    public void compareListOfHashmap() {

        List<Map<String, Integer>> li = new ArrayList<>(Arrays.asList(map1, map4, map5));

        System.out.println(li);

        Collections.sort(li, new Comparator<Map<String, Integer>>() {
            public int compare(Map<String, Integer> map1, Map<String, Integer> map2) {
                return map1.get("Cristiano").compareTo(map2.get("Cristiano"));
            }
        });

        System.out.println(li);
        
    }

    public void compareListOfMapsSmartly() {

        List<Map<String, Integer>> li = new ArrayList<>(Arrays.asList(map1, map4, map5));
        System.out.println(li);

        Comparator<Map<String, Integer>> sortMapByAnyKey = (Map<String, Integer> map1, Map<String, Integer> map2) -> {
            return map1.get("Cristiano").compareTo(map2.get("Cristiano"));
        };
        Collections.sort(li, sortMapByAnyKey);

        System.out.println(li);
    }
    
    public static void main(String[] args) {
        HMap hmap = new HMap();
        // hmap.compareListOfHashmap();
        hmap.compareListOfMapsSmartly();
    }
}
