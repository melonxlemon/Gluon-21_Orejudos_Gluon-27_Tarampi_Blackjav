import java.util.ArrayList;

public class Card {
  protected String name, suit, type;
  protected int value, number;
  protected static ArrayList<Card> deck = new ArrayList <>();
  
  public Card (String n, String s, int v, String t) {
    name = n;
    suit = s;
    value = v;
    type = t;
    deck.add(this);
  }
  public String getName() {
    return name;
  }
  public String getSuit() {
    return suit;
  }
  public int getValue() {
    return value;
  }
  public String getType() {
    return type;
  }
  public void setValueAce(int i) {
    value = i;
  }
}