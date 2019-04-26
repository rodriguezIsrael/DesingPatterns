package com.desingPatterns.structural.facade;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class ComputerFacade {

	private CPU cpu;
	private HardDrive hardDrive;
	private MemoryRam memoryRam;

	public ComputerFacade() {
		cpu = new CPU();
		hardDrive = new HardDrive();
		memoryRam = new MemoryRam();
	}
	
	public void onComputer() {
		System.out.println("On Computer");
		cpu.turnOn();
		memoryRam.load();
		hardDrive.init();
	}

	public void offComputer() {
		
		System.out.println("OFF Computer");
		
		hardDrive.stop();
		cpu.turnOff();

	}

}
