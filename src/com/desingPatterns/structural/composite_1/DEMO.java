package com.desingPatterns.structural.composite_1;

import com.desingPatterns.structural.composite_1.imp.Document;
import com.desingPatterns.structural.composite_1.imp.Folder;

public class DEMO {
	
	public static void main(String ...args) {
		File folder01 = new Folder("Folder 01");
		File folder02 = new Folder("Folder 02");
		File folder03 = new Folder("Folder 03");
		
		
		File document01 = new Document("Document 01");
		File document02 = new Document("Document 02");
		File document03 = new Document("Document 03");
		File document04 = new Document("Document 04");
		File document05 = new Document("Document 05");
		File document06 = new Document("Document 06");
		
		
		folder01.add(document01);
		folder02.add(document02);
		folder03.add(document03);
		
		
		folder01.add(document04);
		folder02.add(document05);
		folder03.add(document06);
		
		folder03.add(folder02);
		
		folder01.show();
		folder02.show();
		folder03.show();
		
	}


}
