package collection.link;

public class MyLinkedListV1Main {

  public static void main(String[] args) {
    MyLinkedListV1 list = new MyLinkedListV1();
    System.out.println("==데이터 추가==");
    System.out.println(list);
    list.add("a");
    System.out.println(list);
    list.add("b");
    System.out.println(list);
    list.add("c");
    System.out.println(list);

    System.out.println("==기능 사용==");
    System.out.println("list.size() = " + list.size());
    System.out.println("list.get(1) = " + list.get(1));
    System.out.println("list.indexOf('c') = " + list.indexOf("c"));
    System.out.println("list.set(2, 'z') = " + list.set(2, "z"));
    System.out.println(list);

  }
}
