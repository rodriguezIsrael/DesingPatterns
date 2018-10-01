package com.desingPatterns.structural.adapter;

/**
 * 
 * @author isivroes
 *
 */
public class FormatAdapter implements MediaPlayer {

	private MediaPackage media;

	/**
	 * @param media
	 */
	public FormatAdapter(MediaPackage media) {
		super();
		this.media = media;
	}

	@Override
	public void play(String filename) {
		System.out.print("Using Adapter --> ");
		media.playFile(filename);
	}

}
