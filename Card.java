public class Card {
    //Instance Variables
    private Suit suit;
    private CardValue cardValue;

    public Card (CardValue cardValue, Suit suit){
        this.cardValue = cardValue;
        this.suit = suit;
    }

    //Setters
    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    public void setCardValue(CardValue cardValue)
    {
        this.cardValue = cardValue;
    }

    //Getters
    public Suit getSuit()
    {
        return suit;
    }

    public CardValue getCardValue()
    {
        return cardValue;
    }


}
