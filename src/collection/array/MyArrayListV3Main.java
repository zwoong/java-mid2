package collection.array;

public class MyArrayListV3Main {

  public static void main(String[] args) {
    MyArrayListV3 list = new MyArrayListV3();
    // 마지막에 추가 // O(1)
    list.add("a");
    list.add("b");
    list.add("c");
    System.out.println(list);

    // 원하는 위치에 추가
    list.add(3, "addList"); // O(1)
    System.out.println(list);

    list.add(0, "addFirst"); // O(n)
    System.out.println(list);

    // 삭제
    Object remove = list.remove(4);
    System.out.println(remove);
    System.out.println(list);

    list.remove(0); // O(n)
    System.out.println(list);
  }

}
