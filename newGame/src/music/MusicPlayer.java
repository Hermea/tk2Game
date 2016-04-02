package music;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {
	
	private Clip clip;
	
	public void playSound(String fileName){

        try {
            // Open an audio input stream.
        	File soundFile = new File(fileName);
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            // Get a sound clip resource.
            clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();
         } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } catch (LineUnavailableException e) {
            e.printStackTrace();
         }
      }
	
	public void muteSound() {
		clip.stop();
	}
}
