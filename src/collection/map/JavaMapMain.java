package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapMain {

  public static void main(String[] args) {
    run(new HashMap<>());
    run(new LinkedHashMap<>());
    run(new TreeMap<>());
  }

  private static void run(Map<String, Integer> map) {
    map.put("C", 10);
    map.put("B", 20);
    map.put("A", 30);
    map.put("1", 40);
    map.put("2", 50);

    System.out.println("map.getClass() = " + map.getClass());
    System.out.println("map = " + map);
  }
}
