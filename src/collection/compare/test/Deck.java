package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
  private List<Card> cards = new ArrayList<>();

  public Deck() {
    String[] suits = {"♠", "♥", "◆", "♣"};
    for (int number = 1; number <= 13; number++) {
      for (String suit : suits) {
        cards.add(new Card(number, suit));
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public Card draw() {
    return cards.remove(0);
  }
}
