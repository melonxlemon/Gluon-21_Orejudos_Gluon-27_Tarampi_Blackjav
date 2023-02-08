import java.util.ArrayList;

public abstract class Dealer extends Character {
    protected ArrayList<Card> cardsOnDealer;

    public Dealer(String n){
      super(n);
    }
    public void addCard(Card c) {
      Card.deck.remove(c);
      cardsOnDealer.add(c);
    }
    public void removeCard(Card c) {
      cardsOnDealer.remove(c);
      Card.deck.add(c);
    }
    public void dealerHit() throws DealerAIException{
      cardsOnDealer.addCard(this);
      if (points >= 17) throw new Exception ("Dealer has decided to stand");
      if (points > 21) throw new Exception (setValueAce(1));
    }
    public void stand() {
      while (cardsOnDealer.size() > 0) {
        removeCard(cardsOnDealer[0]);
      }
    }
}