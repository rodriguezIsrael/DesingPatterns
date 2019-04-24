package com.desingPatterns.creational.decorator_2.decorator;

import com.desingPatterns.creational.decorator_2.Notification;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class SlackNotificationDecorator implements Notification {

	Notification notification;

	/**
	 * 
	 */
	public SlackNotificationDecorator() {

	}

	/**
	 * 
	 * @param notification
	 */
	public SlackNotificationDecorator(Notification notification) {
		this.notification = notification;
	}

	/**
	 * 
	 */
	@Override
	public void description() {
		System.out.println("Send slack notification");
		if (notification != null) {

			notification.description();
		}

	}

}
