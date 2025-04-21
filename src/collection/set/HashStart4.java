package collection.set;

import java.util.Arrays;

public class HashStart4 {
  static final int CAPACITY = 10;

  public static void main(String[] args) {
    System.out.println("hashIndex(1) = " + hashIndex(1));
    System.out.println("hashIndex(2) = " + hashIndex(2));
    System.out.println("hashIndex(5) = " + hashIndex(5));
    System.out.println("hashIndex(8) = " + hashIndex(8));
    System.out.println("hashIndex(14) = " + hashIndex(14));
    System.out.println("hashIndex(14) = " + hashIndex(14));
    System.out.println("hashIndex(99) = " + hashIndex(99));

    Integer[] inputArray = new Integer[CAPACITY];
    add(inputArray, 1);
    add(inputArray, 2);
    add(inputArray, 5);
    add(inputArray, 8);
    add(inputArray, 14);
    add(inputArray, 99);
    System.out.println("inputArray = " + Arrays.toString(inputArray));

    // 검색
    int searchValue = 14;
    int hashIndex = hashIndex(searchValue);
    Integer integer = inputArray[hashIndex];
    System.out.println("integer = " + integer);
  }

  private static void add(Integer[] inputArray, int i) {
    int hashIndex = hashIndex(i);
    inputArray[hashIndex] = i;
  }

  static int hashIndex(int value) {
    return value % CAPACITY;
  }
}
