package gameControllers;

import java.util.Scanner;
import gameObjects.Board;
import gameObjects.Player;


public class TurnController 
{
	Player p;
	static Board board;
	static Scanner input;

	@SuppressWarnings("static-access")
	public TurnController(Board b)
	{
		this.board = b;
	}

	//controls player turns

	//takes player object

	public static void turn(Player p)
	{
		input = new Scanner(System.in);
		String playerselect = "";
		Boolean turnloop = true;

		//		System.out.println("Start of turn");
		//
		//		board.printBoard();

		System.out.println("State of current board: ");

		board.showFL();
		
		System.out.println("Player " + p.pNum() + "'s turn");

		while(turnloop)
		{
			
			System.out.println("Select FIRST or LAST(type either FIRST or LAST)");
			playerselect = input.nextLine().toLowerCase();

			switch(playerselect)
			{
			case "first": 
				//stuff
				System.out.println("Selected the first card");
				p.addToDeck(board.takeFirst());
				System.out.println("Player's score: " + p.getScore());
				turnloop = false;
				break;
			case "last":
				//stuff
				System.out.println("Selected the last card");
				p.addToDeck(board.takeLast());
				System.out.println("Player's score: " + p.getScore());
				turnloop = false;
				break;
			default: 	
				System.out.println("Please us correct input of FIRST or LAST.");
			}
		}

	}

	//START OF TURN:
	//print current board state

	//give player choice of taking first or last card

	//move chosen card to player's hand

	//END
}
