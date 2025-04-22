package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayToMapTest {

  public static void main(String[] args) {
    String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

    HashMap<String, Integer> hashMap = new HashMap<>();
    for (String[] strings : productArr) {
      String key = strings[0];
      String value = strings[1];
      hashMap.put(key, Integer.valueOf(value));
    }

    for (Entry<String, Integer> entry : hashMap.entrySet()) {
      System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
    }
    
  }
}
