package com.desingPatterns.creational.decorator_2.decorator;

import com.desingPatterns.creational.decorator_2.Notification;

/**
 * 
 * @author Israel Rodriguez
 *
 */
public class EmailNotificationDecorator implements Notification {

	Notification notification;

	/**
	 * 
	 * @param notification
	 */
	public EmailNotificationDecorator(Notification notification) {
		this.notification = notification;
	}

	/**
	 * 
	 */
	public EmailNotificationDecorator() {

	}

	/**
	 * 
	 */
	@Override
	public void description() {
		System.out.println("Send email notification");

		if (notification != null) {

			notification.description();
		}

	}

}
