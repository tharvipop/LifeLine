/**
 * 
 */
package View;

import java.io.File;
import java.io.FileNotFoundException;

import controller.World;
import model.ScoreBoard;
import storyText.StoryBank;
/**
 * @author atharvakulkarni
 *
 */
public class Run {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		
		StoryBank bank = new StoryBank();
		World game = new World();
		ScoreBoard oof = new ScoreBoard(20);
		//ScoreBoard oof = new ScoreBoard(new File("scores.txt"));
		
		game.play();
	}

}
