public abstract class Character {
    protected String name;
    protected int points;
    protected Card currentCard;

    public Character(String n){
      this.name = n;
    }
    public String getName(){
      return name;
    }
    public int getPoints(){
      return points;
    }
    public void gainPoints(int i){
      points += i;
    }
    public abstract void addCard();
    public abstract void removeCard();
    public abstract void stand();
}