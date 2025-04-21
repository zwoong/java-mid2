package collection.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

  public static void main(String[] args) {
    System.out.println("n개의 정수를 입력하세요 (종료 0)");
    Scanner scanner = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();
    while (true) {
      int n = scanner.nextInt();
      if (n == 0) {
        break;
      }
      list.add(n);
    }

    int total = 0;
    for (int i = 0; i < list.size(); i++) {
      total += list.get(i);
    }

    double average = (double) total / list.size();
    System.out.println("total = " + total);
    System.out.println("average = " + average);

  }
}
