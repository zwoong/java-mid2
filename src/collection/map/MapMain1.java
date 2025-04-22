package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMain1 {

  public static void main(String[] args) {
    Map<String, Integer> studentMap = new HashMap<>();
    studentMap.put("studentA", 90);
    studentMap.put("studentB", 80);
    studentMap.put("studentC", 90);
    studentMap.put("studentD", 100);
    System.out.println("studentMap = " + studentMap);

    // 특정 학생의 값 조회
    Integer result = studentMap.get("studentD");
    System.out.println("result = " + result);

    System.out.println("KeySet 활용");
    Set<String> keySet = studentMap.keySet();
    for (String key : keySet) {
      System.out.println("key = " + key);
    }

    System.out.println("entrySet 활용");
    Set<Entry<String, Integer>> entries = studentMap.entrySet();
    for (Entry<String, Integer> entry : entries) {
      System.out.println("entry = " + entry);
    }

    System.out.println("values 활용");
    Collection<Integer> values = studentMap.values();
    for (Integer value : values) {
      System.out.println("value = " + value);
    }
  }
}
