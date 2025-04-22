package collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

  public static void main(String[] args) {
    System.out.println("==단어 입력 단계==");
    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> map = new HashMap<>();
    while (true) {
      System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
      String key = scanner.nextLine();
      if (key.equals("q")) {
        break;
      }
      System.out.print("한글 뜻을 입력하세요: ");
      String value = scanner.nextLine();
      map.put(key, value);
    }

    System.out.println("==단어 검색 단계==");
    while (true) {
      System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
      String key = scanner.nextLine();
      if (key.equals("q")) {
        break;
      }
      if (!map.containsKey(key)) {
        System.out.println(key + "은(는) 사전에 없는 단어입니다.");
        continue;
      }
      System.out.println(key + "의 뜻: " + map.get(key));
    }
  }
}
