package warApp;

import java.util.ArrayList;
import java.util.List;

public class Player {
	public List<Card> hand;
	public int score;
	public String name;

	

		public Player(String name) {
	        this.hand = new ArrayList<>();
	        this.score = 0;
	        this.name = name;
	    }

	    public void describe() {
	        System.out.println("Player: " + name);
	        for (Card card : hand) {
	            card.describe();
	        }
	    }

	    public Card flip() {
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        }
	        return null;
	    }

	    public void draw(Deck deck) {
	        Card drawnCard = deck.draw();
	        if (drawnCard != null) {
	            hand.add(drawnCard);
	        }
	    }

	    public void incrementScore() {
	        score++;
	    }

	    public int getScore() {
	        return score;
	    }
	}
