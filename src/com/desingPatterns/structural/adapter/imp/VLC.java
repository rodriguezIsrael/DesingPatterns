package com.desingPatterns.structural.adapter.imp;

import com.desingPatterns.structural.adapter.MediaPackage;

/**
 * 
 * @author isivroes
 *
 */
public class VLC implements MediaPackage {

	@Override
	public void playFile(String filename) {
		System.out.println("Playing VLC File " + filename);
	}

}
