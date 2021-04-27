package game;

import gameObjects.Board;
import gameObjects.Player;
import gameControllers.TurnController;

public class Game 
{
	//basic card game, dealer lays down 2n cards, and both players take 1 card per turn, ONLY from the far left or right
	//player with the highest total rank WINS!!!

	//handles game logic

	static int boardSize = 12;
	static Board gameBoard;
	static Player p1, p2;
	static TurnController tc;

	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{	
		//START: set up the game
		gameBoard = new Board(boardSize);
		tc = new TurnController(gameBoard);

		p1 = new Player(1, boardSize);
		p2 = new Player(2, boardSize);

		System.out.println("Start of game: ");
		
		gameBoard.printBoard();
		
		//TURNLOOP
		//until no cards remain on the board
		while(gameBoard.getBoardSize() > 0)
		{
			tc.turn(p1);

			tc.turn(p2);
		}

		//report scores
		System.out.println("Player 1's score: " + p1.getScore());
		System.out.println("Player 2's score: " + p2.getScore());

		//report winner
		if (p1.getScore() > p2.getScore())
		{
			System.out.println("Player 1 wins!");
		}
		if (p1.getScore() < p2.getScore())
		{
			System.out.println("Player 2 wins!");
		}
		if (p1.getScore() == p2.getScore())
		{
			System.out.println("Tie!");
		}
	}


}
