/**
 * 
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;

import exceptions.BadDataException;
import exceptions.InvalidMoveException;
import interfaces.IGame;
import model.Score;
import model.ScoreBoard;
import music.MusicPlayer;
import storyText.Story;
import storyText.StoryBank;

/**
 * @author atharvakulkarni
 *
 */
@SuppressWarnings("unused")
public class World implements IGame{
	
	public static File f = new File("scores.txt");
	
	//player playing the game 
	public static Player player;

	//current story player is at
	Story current;
	
	//used to format decimals to 2 decimal spaces
	private static DecimalFormat df2 = new DecimalFormat(".##");

	//File direcrory of pin sound to be used at each level
	File pin = new File("/Users/atharvakulkarni/eclipse-workspace/Life Line/music/pin_drop.wav");

	//5 ending levels, only 5th is winning ending
	private int ending1Level = 10; // Taylor dies by poisoning bc he was stationary for too long
	private int ending2Level = 15; // Taylor dies by falling after an attempted climb
	private int ending3Level = 19; // Taylor dies of exhaustion by trying to dig holes for the bodies
	private int ending4Level = 20; // Taylor dies because he has no one to help him
	private int ending5Level = 21; // only winning ending, Taylor and Captain Aya survive

	// Scanner used for user input
	public static final Scanner IN = new Scanner(System.in);

	/**
	 * world constructor
	 */
	public World() {
		initializeNewGame();
	}

	/**
	 * initializes new game
	 */
	private void initializeNewGame() {
		String name = configureName();
		player = new Player(0, name); // currentLevel is always 0 for new players
	}

	/**
	 * main loop of game
	 */
	public void play() {

		printWelcome();

		while (true) {

			
			if (gameOver()) {

				endGame();
				//TODO: update scoreboard, save to file, and print out high scores
				
				try {
					updateScoreboard("" + (player.getLevel() / 21.0) * 100);
				} catch (FileNotFoundException e) {
		
				} catch (BadDataException e) {
					
				}
				
				if (playAgain()) { restart(); } else { break; }

			}
			else if(gameWin()) {

				winGame();
				//TODO: update scoreboard, save to file, and print out high scores
				try {
					updateScoreboard("" + (player.getLevel() / 21.0) * 100);
				} catch (FileNotFoundException e) {
		
				} catch (BadDataException e) {
					
				}
				
				if (playAgain()) { restart(); } else { break; }
				
			}

			current = StoryBank.list.get(player.getLevel());
			println(current.getStory());
			MusicPlayer.playSound(pin);
			println("1) " + current.getOption1());
			println("2) " + current.getOption2());

			String choice = getMove();
			executeMove(choice);
			
		}

	}


	/**
	 * enters a loop to ask for response 
	 * @return the string choice user chose
	 */
	public String getMove() {

		String response;

		while(true) {
			response = IN.nextLine();

			if (response.equalsIgnoreCase("restart")) {
				restart();
			}
			else if (response.equalsIgnoreCase("help")) {
				printHelp();
			}
			else if (isValidMove(response)) {
				return response;
			}
			else {
				println("Try Again.");
			}

		}

	}

	/**
	 * chcks if move is valid
	 * @param move the move made
	 * @return true or false if valid move
	 */
	@Override
	public boolean isValidMove(String move) {
//		if (move.equals("1") || move.equals("2")) {
//			return true;
//		}
//		return false;
		
		try {
			executeMove(move);
			return true;
		}
		catch (Exception ex) {
			return false;
		}
		
		
	}

	/**
	 * makes the move made
	 * @param move the move made
	 * @throws InvalidMoveException exception if move not valid
	 */
	@Override
	public void executeMove(String move) throws InvalidMoveException {	

		if (move.equals("1")) {
			player.setLevel(current.getOption1Level());
		}
		else if (move.equals("2")) {
			player.setLevel(current.getOption2Level());
		}	
		else if (move.equalsIgnoreCase("help")) {
			printHelp();
		} 
		else {
			throw new InvalidMoveException("Try agaubbb");
		}

	}

	/**
	 * configures the user's name
	 * @return the user name
	 */
	private String configureName() {
		String name; 
		int counter = 0;

		while (counter < 5) {

			println("What's your name?");
			print("> ");
			name = IN.nextLine();

			if (name.length() > 10) {
				println("Sorry, that's too long, try again.");
				counter++;
			} else if (name.length() < 1) {
				println("Sorry, that's too short, try again.");
			}
			else { return name; }

		}
		return "Lord Indecisive";
	}


	/**
	 * prints an introductory message so user knows about game
	 */
	private void printWelcome() {
		println(player.getName() + ", welcome to Life Line");
		//TODO: finish method
		println("Life Line is a game in which you help Taylor, a lost astronaut. Guide him and make wise decisions. "
				+ "\nAt each level, you are given 2 options.  ");
		println("Just a tip, try not to lead Taylor to his death, alright?");
		println("If you wish to restart, simply type \"restart\".");
		println("If you need help, simply type \"help\"");
		println("");
	}

	/**
	 * restarts the game 
	 */
	public void restart() {
		player.setLevel(0);
		player.setName("");
		initializeNewGame();
		play();
	}

	/**
	 * tells user how much they scored, and stores score
	 */
	public void endGame() {
		double score = (player.getLevel() / 21.0) * 100;
		println(StoryBank.list.get(player.getLevel()).getStory());
		System.out.printf("You scored: %2.2f out of 100.\n", score);
		println("You lost!");
	}

	/**
	 * tells user how much they scored, and stores score
	 */
	public void winGame() {
		double score = (player.getLevel() / 21.0) * 100;
		println(StoryBank.list.get(player.getLevel()).getStory());
		System.out.printf("You scored: %2.2f out of 100.\n", score);
		println("You won!");

	}

	/**
	 * asks if user wants to play again
	 * @return true or false
	 */
	public boolean playAgain() {

		String response;
		println("Would you like to play again? \"yes\" to restart, \"no\" to quit.");

		while(true) {
			response = IN.nextLine();

			if (response.equalsIgnoreCase("yes")) {
				println("\n\n\n\n\n");
				return true;
			}
			else if (response.equalsIgnoreCase("no")) {
				println("\n\n\n\n\n");
				return false;
			} 
			else {
				println("Try Again.");
			}

		}
	}

	/**
	 * updates scoreboard
	 * @param playerScore the score to add
	 * @throws FileNotFoundException
	 * @throws BadDataException
	 */
	@Override
	public void updateScoreboard(String playerScore) throws FileNotFoundException, BadDataException {
		
		String newStr = String.format("%.2f", Double.parseDouble(playerScore));
		double d = Double.parseDouble(newStr);
		Score s = new Score(player.getName(), d);
		
		
		println(ScoreBoard.personalBest(s));
		
		ScoreBoard.recordScore(s);
		
		ScoreBoard.saveScores(f);
		
		println(ScoreBoard.readScores(f));		
	
	}

	/**
	 * prints a brief description of game incase user is having trouble
	 */
	public void printHelp() {
		//TODO: finish method
		println("Life Line is a game in which you help Taylor, a lost astronaut. Guide him and make wise decisions. "
				+ "\nAt each level, you are given 2 options. Both of them will lead to differnt paths.");
		println("If you wish to restart, simply type \"restart\".");
	}
	
	/**
	 * checks if game has been won
	 * @return true or false
	 */
	public boolean gameWin() {
		if (player.getLevel() == ending5Level){
			return true;
		}
		return false;
	}
	
	/**
	 * checks if game is over
	 * @return true or false
	 */
	@Override
	public boolean gameOver() {
		int level = player.getLevel();
		if (level == ending1Level || level == ending2Level || level == ending3Level
				|| level == ending4Level) {
			return true;
		}
		return false;
	}

	/**
	 * methods that serve same function as regular printing, just shorter 
	 * to type
	 * @param string the str to be printed
	 */
	private void println(String string) {
		System.out.println(string);

	}
	private void print(String string) {
		System.out.print(string);

	}

	/** not needed for this game */
	@Override
	public int determineWinner() {
		// TODO Auto-generated method stub
		return 0;
	}
	/** not needed for this game */
	@Override
	public void displayBoard() {
		// TODO Auto-generated method stub

	}

}
