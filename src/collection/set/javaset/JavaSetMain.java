package collection.set.javaset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSetMain {

  public static void main(String[] args) {
    run(new HashSet<>());
    run(new LinkedHashSet<>());
    run(new TreeSet<>());
  }

  private static void run(Set<String> set) {
    System.out.println("set.getClass() = " + set.getClass());
    set.add("C");
    set.add("B");
    set.add("A");
    set.add("1");
    set.add("2");

    Iterator<String> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next() + " ");
    }
    System.out.println();
  }
}
