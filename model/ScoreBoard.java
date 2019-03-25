package model;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Keeps track of all scores and the high scores.
 * @author tharvipop
 * @version 1.1.0
 */

@SuppressWarnings("unused")
public class ScoreBoard {

	/* TODO: Rename this file as ScoreBoard.java and complete the
	 * following methods using context as clues.
	 * TODO: write methods to complete the following
	 * record score - done
	 * display score - done
	 * update score - done 
	 * display high score - done 
	 * update high score - set high score by comparing - done 
	 * save scores - done
	 * load scores - done 
	 */

	private static ArrayList<Score> allScores;
	private static Score[] highScores;

	/**
	 * Constructor
	 * Defaults to keep track of the top 10 high scores.
	 */
	public ScoreBoard() {
		allScores = new ArrayList<Score>();
		highScores = new Score[10];
	}

	/**
	 * Constructor
	 * @param highScoreBoardSize number of high scores
	 * to keep track of
	 */
	public ScoreBoard(int highScoreBoardSize) {
		allScores = new ArrayList<Score>();
		highScores = new Score[highScoreBoardSize];
	}

	/**
	 * Constructor
	 * Reads through a file and updates the instance variables.
	 * @param saveFile the file where the scores are saved
	 * @throws FileNotFoundException 
	 */
	public ScoreBoard(File saveFile) throws FileNotFoundException {
		allScores = new ArrayList<Score>();
		highScores = new Score[10];

		Scanner in = null;
		try {
			in = new Scanner(saveFile);
			while (in.hasNextLine()) {
				String name = in.next();
				Double score = in.nextDouble();
				allScores.add(new Score(name, score));
			}
		} 
		catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} 
		catch (NumberFormatException ex){
			System.out.println(ex.getMessage());
		}
		finally {
			in.close();
		}
		updateHighScores(highScores.length);
	}

	/**
	 * Adds the new score to the record and updates the
	 * high scores on the scoreboard.
	 * @param newScore the score to be added
	 */
	public static void recordScore(Score newScore) {
		allScores.add(newScore);
		updateHighScores(highScores.length);
	}

	/**
	 * Determines whether the new score is a personal best for
	 * the player or not.
	 * @param newScore the score to be compared
	 * @return the message with results
	 */
	public static String personalBest(Score newScore) {
		/*
		 * Complete this method using the following lines
		 * as the possible returned values.
		 * 
		 * "PLAYER TIED THEIR HIGH SCORE!"
		 * "PLAYER HAS A NEW HIGH SCORE!"
		 * "PLAYER DID NOT BEAT THEIR HIGH SCORE!"
		 * "NEW PLAYER HIGH SCORE!"
		 * "Error"
		 */

		double newScoreValue = newScore.getScore();
		String newName = newScore.getPlayerName();
		
		String compareName = "";
		double compareScore = 0;
		
		boolean found = false;

		for (Score element : allScores) {
			if (element.getPlayerName().equals(newName)) {
				compareName = element.getPlayerName();
				compareScore = element.getScore();
				found = true;
				break;
			}
		}

		// if player has already played
		if (found) {
			if (compareScore == newScoreValue) {
//				System.out.println(compareName);
//				System.out.println(newName);
//				System.out.println(compareScore);
//				System.out.println(newScoreValue);
//				
				return "PLAYER TIED THEIR HIGH SCORE!";
			}
			else if (compareScore > newScoreValue) {
				return "PLAYER DID NOT BEAT THEIR HIGH SCORE!";
			}
			else if (newScoreValue > compareScore) {
				return "PLAYER HAS A NEW HIGH SCORE!";
			}
		} 
		// if player is new and is not on allScores
		else {
			return "NEW PLAYER HIGH SCORE!";
		}

		return "Error";


	}

	/**
	 * saves all Scores to saveFile
	 * @param saveFile
	 * @throws FileNotFoundException 
	 */
	public static void saveScores(File saveFile) throws FileNotFoundException {

		PrintWriter out = null;
		try {
			out = new PrintWriter(saveFile);
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		for (Score element : allScores) {
			out.printf("%-12s%-5f\n", element.getPlayerName(), element.getScore());
		}
		out.close();
	}

	/**
	 * returns a String of all Scores from saveFile
	 * @param saveFile
	 * @return
	 * @throws FileNotFoundException 
	 */
	public static String readScores(File saveFile) throws FileNotFoundException, NoSuchElementException {
		String s = "";
		Scanner in = null;
		try {
			in = new Scanner(saveFile);
			while (in.hasNextLine()) {
				s += in.nextLine();
				s += "\n";
			}
		} 
		catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} 
		catch (NoSuchElementException ex){
			ex.printStackTrace();
		} 
		finally {
			in.close();
		}
		return s;
	}

	/**
	 * updates the high score array from the allScore arraylist
	 */
	public static void updateHighScores(int num) {

		if (allScores.size() > 0 && allScores.size() < 20) {
			
			Score[] temp = new Score[allScores.size()];
			for (int i = 0; i < allScores.size(); i ++) {
				temp[i] = allScores.get(i);
			}
			Arrays.sort(temp, new ScoreSorter());

			for (int i = 0; i < allScores.size(); i ++) {
				highScores[i] = temp[i];
			}
			java.util.List<Score> listOfScores = Arrays.asList(highScores);
			Collections.reverse(listOfScores);
			for (int i = 0; i < num; i ++) {
				highScores[i] = listOfScores.get(i);
			} 
			
		}
	}

	/**
	 * display name and score of all high scores 
	 * @return 
	 * @return a single String of all high scores 
	 */
//	public static String displayHighScores() {
//		String s = "";
//		for (Score element : highScores) {
//			s += element.toString(element) + "\n";
//		}
//		return s;
//
//	}
	public static void displayHighScores() {
		String s = "";
		for (Score element : highScores) {
			System.out.println(element.toString(element));
		}
		

	}


	/**
	 * display name and scores of all scores
	 */
	public static void displayScores() {
		for (Score element : allScores) {
			System.out.printf("%-10s %-10f\n", element.getPlayerName(), element.getScore());
		}
	}

}