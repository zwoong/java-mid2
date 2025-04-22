package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();

    // 데이터 추가
    deque.push(1);
    deque.push(2);
    deque.push(3);
    System.out.println("deque = " + deque);

    // 다음 꺼낼 데이터 확인
    System.out.println("deque.peek() = " + deque.peek());

    // 데이터 꺼내기
    System.out.println("deque.pop() = " + deque.pop());
    System.out.println("deque.pop() = " + deque.pop());
    System.out.println("deque.pop() = " + deque.pop());
    System.out.println("deque = " + deque);
  }
}
