package collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemPriceTest {

  public static void main(String[] args) {
    HashMap<String, Integer> hashMap = new HashMap<>();
    hashMap.put("사과", 500);
    hashMap.put("바나나", 500);
    hashMap.put("망고", 1000);
    hashMap.put("딸기", 1000);

    ArrayList<String> list = new ArrayList<>();
    for (String key : hashMap.keySet()) {
      Integer integer = hashMap.get(key);
      if (integer == 1000) {
        list.add(key);
      }
    }
    System.out.println(list);
  }
}
