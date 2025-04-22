package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {

  public static void main(String[] args) {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("A", 1);
    map1.put("B", 2);
    map1.put("C", 3);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("B", 4);
    map2.put("C", 5);
    map2.put("D", 3);

    Map<String, Integer> result = new HashMap<>();
    for (String key : map2.keySet()) {
      if (map1.containsKey(key)) {
        int sum = map1.get(key) + map2.get(key); // map1, map2 각각의 값을 더함
        result.put(key, sum); // 결과 맵에 추가
      }
    }

    System.out.println(result);
  }
}
