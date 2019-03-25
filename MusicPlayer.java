/**
 * 
 */
package music;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 * @author atharvakulkarni
 *
 */
public class MusicPlayer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		File pin = new File("/Users/atharvakulkarni/eclipse-workspace/Life Line/music/pin_drop.wav");
//		playSound(pin);

	}

	public static void playSound(File sound) {

		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(sound));
			clip.start();
			
			
			Thread.sleep(clip.getMicrosecondLength()/12000);
		}
		catch (Exception e) {


		}

	}

}
