package Game;

public enum Suit {
	CLUBS, SPADES, DIAMONDS, HEARTS;
public boolean isRed(){
		return (this == HEARTS || this == DIAMONDS);
	}

public boolean isBlack(){
	return (this == CLUBS || this == SPADES);
}
}
