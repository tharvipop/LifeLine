package interfaces;

import java.io.FileNotFoundException;

import exceptions.BadDataException;
import exceptions.InvalidMoveException;

public interface IGame {

	public boolean isValidMove(String move);
	public void executeMove(String move) throws InvalidMoveException;
	public boolean gameOver();
	public void displayBoard();
	public int determineWinner();
	public void updateScoreboard(String playerScore) throws FileNotFoundException, BadDataException;	
	
}
