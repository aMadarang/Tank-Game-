package TankGameMaster;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;

public class Sound {
	private AudioInputStream soundStream;
	private String soundFile;
	private Clip clip;
	private int type;//1 for sounds that needs to be played all the time
	// 2 for sounds that only need to be played once


	public Sound(int type, String soundFile) {

	}
}
