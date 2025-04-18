package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtils {

  static <T extends BioUnit> T maxHtp(T t1, T t2) {
    return t1.getHp() > t2.getHp() ? t1 : t2;
  }
}
