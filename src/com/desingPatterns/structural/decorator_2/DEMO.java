package com.desingPatterns.structural.decorator_2;

import com.desingPatterns.structural.decorator_2.decorator.EmailNotificationDecorator;
import com.desingPatterns.structural.decorator_2.decorator.SMSNotificationDecorator;
import com.desingPatterns.structural.decorator_2.decorator.SlackNotificationDecorator;
import com.desingPatterns.structural.decorator_2.decorator.WhatsappNotificationDecorator;

/**
 * @author Israel Rodriguez
 */
public class DEMO {

    public static void main(String[] args) {
        Notification notification = new WhatsappNotificationDecorator(new EmailNotificationDecorator(
                new SlackNotificationDecorator(new SMSNotificationDecorator(50))));
        notification.description();
    }

}
