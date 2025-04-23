package collection.compare.test;

public class Card implements Comparable<Card> {
  private int number;
  private String suit;

  public Card(int number, String suit) {
    this.number = number;
    this.suit = suit;
  }

  // 정렬 기준 설정
  @Override
  public int compareTo(Card o) {
    if (this.number != o.number) {
      return this.number - o.number; // 숫자 오름차순
    } else {
      // 숫자가 같을 경우: ♠ > ♥ > ◆ > ♣ 순서로 정렬
      return suitPriority(this.suit) - suitPriority(o.suit);
    }
  }

  private int suitPriority(String suit) {
    switch (suit) {
      case "♠": return 1;
      case "♥": return 2;
      case "◆": return 3;
      case "♣": return 4;
      default: return 5;
    }
  }

  @Override
  public String toString() {
    return number + "(" + suit + ")";
  }

  public int getNumber() {
    return number;
  }
}
