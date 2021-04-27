package gameObjects;

public class Board {

	int currentSize;
	Deck board;

	public Board(int boardSize) 
	{
		Deck deck = new Deck();
		this.board = new Deck(boardSize);

		deck.shuffleDeck();

		board.drawHand(deck, boardSize);
		
		currentSize = board.getSize();
	}

	public int getBoardSize()
	{
		currentSize = board.getSize();
		return currentSize;
	}
	
	public Card takeFirst()
	{
		Card temp = board.getFirstCard();
		System.out.println("took from top of deck");
		System.out.println("card taken: " + temp.printCard() );
		return temp;
	}

	public Card takeLast()
	{
		Card temp = board.getLastCard();
		System.out.println("took from bottom of deck");
		System.out.println("card taken: " + temp.printCard() );
		return temp;
	}
	
	public void printBoard()
	{
		board.printDeck();
	}
	
	public void showFL()
	{
		board.showFirstLast();
	}

}
