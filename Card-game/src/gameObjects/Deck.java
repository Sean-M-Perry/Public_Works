package gameObjects;

import java.util.Random;
import java.util.Stack;

public class Deck 
{
	Stack<Card> d;
	private static final Random generator = new Random();

	public Deck()
	{
		d = new Stack<Card>();
		//need to fill deck with cards
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 13; j++)
			{
				Card c = new Card(j, i);
				d.push(c);
			}
		}
	}
	
	public Deck(int i)
	{
		d = new Stack<Card>();
	}
	
	public int getSize()
	{
		return d.size();
	}

	public void shuffleDeck()
	{
		//linear shuffle method
		//for each element in the array, generate a random number(within the array) and swap the cards between the two elements
		for(int i = 0; i < d.size(); i++)
		{
			int rand = generator.nextInt(d.size());
			Card temp = d.get(i);
			d.set(i, d.get(rand));
			d.set(rand, temp);
		}
	}

	public void drawHand(Deck deck, int size)
	{
		for (int i = 0; i < size; i++)
		{
			d.push(deck.getFirstCard());
		}
	}
	
	public void showFirstLast()
	{
		System.out.println("\tFIRST: " + d.lastElement().printCard());
		System.out.println("\tLAST: " + d.firstElement().printCard());
	}

	public Card getFirstCard()
	{
		//used to pull a draw card from the deck
		return d.pop();
	}

	public Card getLastCard()
	{
		//used to take the bottom card from the deck
		return d.remove(0);
	}
	
	public void addCard(Card c)
	{
		d.push(c);
	}

	public void printDeck()
	{
		//print the cards in the deck
		for(int i = d.size() - 1; i >= 0; i--)
		{
			System.out.println("\t" + d.get(i).printCard());
		}
	}

}
