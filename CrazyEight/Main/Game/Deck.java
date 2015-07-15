package Game;

public class Deck extends CardList {
	public Deck(){
		for (Suit s : Suit.values()){
			for(Rank r : Rank.values()){
				Card card = new Card(s,r);
				add(card);
			}
		}
	}
	public void shuffle(){
		for (int i = 0 ; i < size() * 2; i++){
			Card card = pullRandom();
			add(card);
		}
	}
	public static void main (String[] args){
		Deck deck = new Deck();
		deck.shuffle();
		System.out.println(deck);
		
	}

}
