package collection.list;

public class BatchProcessor {
  private final MyList<Integer> list;

  // MyList = MyArrayList
  // MyList = MyLinkedList
  public BatchProcessor(MyList<Integer> list) {
    this.list = list;
  }

  public void logic(int size) {
    long statTime = System.currentTimeMillis();
    for (int i = 0; i < size; i++) {
      list.add(0, i); // 앞에 추가
    }
    long endTime = System.currentTimeMillis();
    System.out.println("size = " + size + ", 계산 시간: " + (endTime - statTime) + "ms");
  }
}
