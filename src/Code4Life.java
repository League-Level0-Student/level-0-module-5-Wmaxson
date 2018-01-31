/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;


public class Code4Life {
	/*
     * Ask the user how many hours they spent coding this week.
     * 
     * 1. If it's 3 or more, tell them they're a Code Ninja.
     * 
     * 2. If it's less than 2, tell them to stop watching YouTube and write code instead.
     * 
     * 3. If it's more than 5, play the Batman theme song.
     */
	public static void main(String[] args) {
		String hours1 = JOptionPane.showInputDialog("How many hours of code have you done this week.");
		int hours = Integer.parseInt(hours1);
		if (hours >= 5) {
			playBatmanTheme();
			
		} else if (hours >= 3) {
			JOptionPane.showMessageDialog(null, "Nice my dude, earning them, coding credit");
		} else if (hours <= 2) {
			JOptionPane.showMessageDialog(null, "Stop watching youtube, and start coding! - Dave");
		} 
	}

    private static void playBatmanTheme() {
    	try {
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
   		 clip.start();
   		 Thread.sleep(60002);
   	} catch (Exception ex) {
     	ex.printStackTrace();
   	}
    }


}