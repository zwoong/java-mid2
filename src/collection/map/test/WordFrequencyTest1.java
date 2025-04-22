package collection.map.test;

import java.util.HashMap;

public class WordFrequencyTest1 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";
    String[] split = text.split(" ");

    HashMap<String, Integer> hashMap = new HashMap<>();

    for (String word : split) {
      hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
    }

    System.out.println("hashMap = " + hashMap);
  }
}
