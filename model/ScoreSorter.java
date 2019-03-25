/**
 * 
 */
package model;

import java.util.Comparator;

/**
 * @author atharvakulkarni
 *
 */
public class ScoreSorter implements Comparator<Score>{

	@Override
	public int compare(Score o1, Score o2) {
		if ( o1.getScore() < o2.getScore() ) return -1;
        else if ( o1.getScore() == o2.getScore() ) return 0;
        else return 1;
	} 

}
