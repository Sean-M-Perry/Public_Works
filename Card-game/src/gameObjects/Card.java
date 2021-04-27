package gameObjects;

import enums.Rank;
import enums.Suit;

public class Card 
{
	private int value;	private Suit suit;	private Rank rank;

	private Suit suitarr[] = Suit.values(); 	private Rank rankarr[] = Rank.values();

	//construct of the cards
	public Card(int i, int j)
	{
		rank = rankarr[i];
		suit = suitarr[j];
		value = i + 1;
	}

	public Rank getRank() 
	{
		return rank;
	}

	public Suit getSuit() 
	{
		return suit;
	}

	public int getValue()
	{
		return value;
	}

	public String printCard()
	{
		Rank r = getRank();
		Suit c = getSuit();
		//		int v = getValue();

		return (r + " of " + c);
	}

}
