import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Deck {
    private Arraylist deck;

    public Deck(){
        this.deck = new ArrayList();

        for (inti = 0; i<12; i++){
            CardValue value = CardValue.values()[i];

            for(int j = 0; j < 4; j++){
                Card card = new Card(value, Suit.values()[j]);
                this.deck.add(card);
            }
        }//Loop


        Iterator cardIterator = deck.iterator();
        while (cardIterator.hasNext()){
            Card aCard - cardIterator.Next();
            System.out.println(aCard.getCardValue() + " of " + aCard.getSuit());
        }
    }//Deck
}//Class
