package com.desingPatterns.structural.adapter;

import com.desingPatterns.structural.adapter.imp.MP3;
import com.desingPatterns.structural.adapter.imp.MP4;
import com.desingPatterns.structural.adapter.imp.VLC;

/**
 * 
 * @author isivroes
 *
 */
public class DEMO {

	public static void main(String[] args) {
		MediaPlayer player = new MP3();
		player.play("file.mp3");

		player = new FormatAdapter(new MP4());
		player.play("file.mp4");

		player = new FormatAdapter(new VLC());
		player.play("file.avi");

	}

}
