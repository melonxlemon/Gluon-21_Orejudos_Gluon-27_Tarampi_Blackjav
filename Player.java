import java.util.ArrayList;

public class Player extends Character {
    protected int cash;
    protected ArrayList<Card> cardsOnPlayer;

    public Player(String n){
      super(n);
    }
    public void addCard(Card c) {
      Card.deck.remove(c);
      cardsOnPlayer.add(c);
    }
    public void removeCard(Card c) {
      cardsOnPlayer.remove(c);
      Card.deck.add(c);
    }
    public void playerHit(Card currentCard) {
      cardsOnPlayer.addCard(this);
    }
    public void stand() {
      while (cardsOnPlayer.size() > 0) {
        removeCard(cardsOnPlayer[0]);
      }
    }
}