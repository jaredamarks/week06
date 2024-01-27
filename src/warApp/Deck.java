package warApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {
	
List<Card> cards;

	public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (String suit : suits) {
            for (int value = 2; value <= 14; value++) {
                Card card = new Card();
                card.setValue(value);
                card.setName(getCardName(value, suit));
                cards.add(card);
            }
        }
    }
    
    
    private String getCardName(int value, String suit) {
        String cardName;
        switch (value) {
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";
                break;
            case 14:
                cardName = "Ace";
                break;
            default:
                cardName = Integer.toString(value);
        }
        return cardName + " of " + suit;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }
}

    
    
    
