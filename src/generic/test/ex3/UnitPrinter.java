package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {
  static <T extends Shuttle> void printV1(T shuttle) {
    System.out.println("이름: " + shuttle.getName() + ", HP: " + shuttle.getHp());
  }

//  static void printWildcardV1(Box<?> box) {
//    System.out.println("? = " + box.getValue());
//  }


}
