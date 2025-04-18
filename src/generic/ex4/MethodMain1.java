package generic.ex4;

public class MethodMain1 {

  public static void main(String[] args) {
    Integer i = 10;
    Object object = GenericMethod.objMethod(i);

    // 타입 인자(Type Arqument) 면시적 전달
    System.out.println("명시적 타입 인자 전달");
    Integer result1 = GenericMethod.<Integer>genericMethod(i);
    Integer integerValue1 = GenericMethod.<Integer>numberMethod(10);
    Double doubleValue1 = GenericMethod.<Double>numberMethod(20.0);

    System.out.println("타입 추론");
    Integer result2 = GenericMethod.genericMethod(i);
    Integer integerValue2 = GenericMethod.numberMethod(10);
    Double doubleValue2 = GenericMethod.numberMethod(20.0);
  }
}
