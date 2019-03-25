/**
 * 
 */
package controller;

/**
 * @author atharvakulkarni
 *
 */
public class Player {
	
	private int currentLevel;
	private String name;

	
	public Player(int currentLevel, String name) {
		this.currentLevel = currentLevel;
		this.name = name;
	}

	
	public int getLevel() {
		return currentLevel;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

}
