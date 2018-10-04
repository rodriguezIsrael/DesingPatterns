package com.desingPatterns.structural.adapter.imp;

import com.desingPatterns.structural.adapter.MediaPackage;

/**
 * 
 * @author isivroes
 *
 */
public class MP4 implements MediaPackage {

	@Override
	public void playFile(String filename) {
		System.out.println("Playing MP4 File " + filename);
	}

}
