package com.desingPatterns.structural.facade;

public class DEMO {

	public static void main(String[] args) {
		ComputerFacade computerFacade = new ComputerFacade();
		
		computerFacade.onComputer();
		computerFacade.offComputer();
		

	}

}
