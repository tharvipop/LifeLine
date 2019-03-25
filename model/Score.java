/**
 * 
 */
package model;

/**
 * An object that holds the score and name of the player that obtained that score
 * @author atharvakulkarni
 *
 */
public class Score implements Comparable<Object> {

	private String playerName;
	private double score;	
	
	/**
	 * Constructor
	 * @param name the name used
	 * @param score value used
	 */
	public Score(String name, double score) {
		this.playerName = name;
		this.score = score;
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public double getScore() {
		return score;
	}

	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object otherObject) {
		Score other = (Score) otherObject;
		if (score < other.score) { return -1; }
		if (score > other.score) { return 1; }
		return 0;
	}

	/**
	 * 
	 * @param s
	 * @return
	 */
	public String toString(Score s) {
		return s.getPlayerName() + " " + s.getScore();
	}
		
}
