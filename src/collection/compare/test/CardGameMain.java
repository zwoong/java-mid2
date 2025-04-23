package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.shuffle();

    System.out.println("deck = " + deck);

    List<Card> player1Hand = new ArrayList<>();
    List<Card> player2Hand = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      player1Hand.add(deck.draw());
      player2Hand.add(deck.draw());
    }

    // 정렬
    Collections.sort(player1Hand);
    Collections.sort(player2Hand);

    // 출력 및 합계 계산
    int player1Sum = printHand("플레이어1", player1Hand);
    int player2Sum = printHand("플레이어2", player2Hand);

    // 승자 판별
    if (player1Sum > player2Sum) {
      System.out.println("플레이어1 승리");
    } else if (player2Sum > player1Sum) {
      System.out.println("플레이어2 승리");
    } else {
      System.out.println("무승부");
    }
  }

  private static int printHand(String playerName, List<Card> hand) {
    int sum = 0;
    for (Card card : hand) {
      sum += card.getNumber();
    }
    System.out.println(playerName + "의 카드: " + hand + ", 합계: " + sum);
    return sum;
  }
}
