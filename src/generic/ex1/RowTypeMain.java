package generic.ex1;

public class RowTypeMain {

  public static void main(String[] args) {
    GenericBox interBox = new GenericBox(); // 타입 지정을 안할시 기본으로 Object
    // GenericBox<ObjectBox> integerBix = new GenericBox<>(); // 권장
    interBox.setValue(10);
    Integer result = (Integer) interBox.getValue();
    System.out.println("result = " + result);
  }
}
