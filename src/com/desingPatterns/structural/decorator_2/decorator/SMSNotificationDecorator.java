package com.desingPatterns.structural.decorator_2.decorator;

import com.desingPatterns.structural.decorator_2.Notification;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class SMSNotificationDecorator implements Notification {

	private Notification notification;
	private int minuts;

	/*
	 * +
	 * 
	 */
	public SMSNotificationDecorator(Notification notification) {
		this.notification = notification;
	}

	/**
	 * 
	 * @param minuts
	 */
	public SMSNotificationDecorator(int minuts) {
		this.minuts = minuts;
	}

	/**
	 * 
	 */
	@Override
	public void description() {
		if (minuts != 0) {
			System.out.println("Send SMS notification in " + minuts + " minuts");
		}

		if (notification != null) {

			notification.description();
		}

	}

}
