import java.util.ArrayList;

public class System {
  int min = 0;
  int max = Card.deck.size();
  public int setCard() {
    int randomIndex = (int)(Math.random()*max);
    return randomIndex;
  }
}
   