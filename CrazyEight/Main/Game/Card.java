package Game;

import java.util.Hashtable;

public class Card {

	private Suit suit;
	private Rank rank;

	public Card(Suit suit,Rank rank){
		this.suit = suit;
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Rank getRank() {
		return rank;
	}
	
//	@Override
//	public boolean equals(Object obj){
//		boolean result = false;
//		if(obj instanceof Card){
//			Card that = (Card) obj;
//			result = (that.suit == this.suit && that.rank == this.rank);
//		}
//		return result;
//	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rank == null) ? 0 : rank.hashCode());
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit != other.suit)
			return false;
		return true;
	}
	public static void main(String[] args){
		Card one = new Card(Suit.SPADES, Rank.ACE);
		Card two = new Card(Suit.SPADES, Rank.ACE);
		Card three = new Card(Suit.DIAMONDS, Rank.TEN);
		boolean compare = one.equals(two);
		System.out.println("Card one compared to Card two" + compare);
		compare = two.equals(three);
		System.out.println("Card two compared to Card three" + compare);
		
		Hashtable<String, Card> tab = new Hashtable<String, Card>();
		tab.put("fred", one);
		tab.put("george", two);
		tab.put("steve", three);
		
		Card found = tab.get("fred");	
		System.out.println("Fred got " + found);
		 found = tab.get("steve");	
		System.out.println("steve got " + found);
	}
	
}
