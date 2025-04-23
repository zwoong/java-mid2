package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
  private Deque<String> history = new ArrayDeque<>();

  public void visitPage(String page) {
    System.out.println("방문: " + page);
    history.push(page);
  }

  @Override
  public String toString() {
    return "BrowserHistory{" +
        "history=" + history +
        '}';
  }

  public String goBack() {
    System.out.println("뒤로 가기: " + history.pop());
    return history.peek();
  }
}
