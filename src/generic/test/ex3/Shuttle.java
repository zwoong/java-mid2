package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
  private T unit;

  void in(T t) {
    unit = t;
  }

  T out() {
    return unit;
  }

  void showInfo() {
    System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
  }
}
