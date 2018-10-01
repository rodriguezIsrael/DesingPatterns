package com.desingPatterns.structural.adapter.imp;

import com.desingPatterns.structural.adapter.MediaPlayer;

/**
 * 
 * @author isivroes
 *
 */
public class MP3 implements MediaPlayer {

	@Override
	public void play(String filename) {
		System.out.println("Playing MP3 FIle " + filename);

	}

}
