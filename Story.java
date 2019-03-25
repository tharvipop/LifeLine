/**
 * 
 */
package storyText;

/**
 * @author atharvakulkarni
 * 
 */
public class Story {

	private String storyString;
	private int storyLevel;
	private int option1Level;
	private int option2Level;
	private String option1;
	private String option2;
	
	/**
	 * constructor for regular stories
	 * @param storyString the story 
	 * @param storyLevel the level of story
	 * @param option1Level the string of first option
	 * @param option2Level the string of second option
	 * @param option1 the level of first option
	 * @param option2 the level of second option
	 */
	public Story(String storyString, int storyLevel, int option1Level, int option2Level, 
			String option1, String option2) {
		
		this.storyString = storyString;
		this.storyLevel = storyLevel;
		this.option1Level = option1Level;
		this.option2Level = option2Level;
		this.option1 = option1;
		this.option2 = option2;
		
	}
	
	/**
	 * constructor for end level stories
	 * @param storyString the story
	 * @param storyLevel the level of story
	 */
	public Story(String storyString, int storyLevel) {
		
		this.storyString = storyString;
		this.storyLevel = storyLevel;
		
	}
	
	/**
	 * story string getter
	 * @return the string of story
	 */
	public String getStory() {
		return storyString;
	}
	
	/**
	 * story level getter
	 * @return the level of story
	 */
	public int getLevel() {
		return storyLevel;
	}

	/**
	 * first option level getter
	 * @return the first option level
	 */
	public int getOption1Level() {
		return option1Level;
	}
	
	/**
	 * second option level getter
	 * @return the second option level
	 */ 
	public int getOption2Level() {
		return option2Level;
	}
	
	/**
	 * first option string getter
	 * @return string of first option
	 */
	public String getOption1() {
		return option1;
	}
	
	/**
	 * second option string getter
	 * @return string of second option
	 */
	public String getOption2() {
		return option2;
	}

}
