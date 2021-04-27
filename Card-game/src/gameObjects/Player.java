package gameObjects;

//holds player's hand and score

public class Player {

	int score;
	int playerNumber;
	Deck hand;
	
	public Player(int playerNumber, int bSize)
	{
		this.playerNumber = playerNumber;
		score = 0;
		hand = new Deck(bSize/2);
	}
	
	public void addToScore(int s)
	{
		score += s;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public void addToDeck(Card c)
	{
		hand.addCard(c);
		addToScore(c.getValue());
	}
	
	public int pNum()
	{
		return playerNumber;
	}
}
