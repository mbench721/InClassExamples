package Game;

import java.util.ArrayList;
import java.util.Random;

public class CardList {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	public void add(Card newCard){
		cards.add(newCard);
	}
	public Card pull(){
		return cards.remove(0);
	}
	public Card peek(){
		return cards.get(0);
	}
	public int size(){
		return cards.size();
	}
	public Card pullRandom(){
		Random rgen = SingleRandom.get();
		int n = rgen.nextInt(cards.size());
		return cards.remove(n);
	}
	@Override
	public String toString(){
		StringBuffer result = new StringBuffer();
		for (Card c : cards){
			result.append(c + "\n");
		}
		return result.toString();
	}
}

