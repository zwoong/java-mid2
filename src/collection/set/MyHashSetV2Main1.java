package collection.set;

public class MyHashSetV2Main1 {

  public static void main(String[] args) {
    MyHashSetV2 set = new MyHashSetV2(10);
    set.add("A");
    set.add("B");
    set.add("C");
    set.add("D");
    set.add("AB");
    set.add("SET");
    System.out.println(set);

    System.out.println("\"A\".hashCode() = " + "A".hashCode());
    System.out.println("\"B\".hashCode() = " + "B".hashCode());

    // 검색
    String searchValue = "SET";
    boolean contains = set.contains(searchValue);
    System.out.println("contains = " + contains);
  }
}
