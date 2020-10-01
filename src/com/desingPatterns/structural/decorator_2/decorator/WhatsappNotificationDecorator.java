package com.desingPatterns.structural.decorator_2.decorator;

import com.desingPatterns.structural.decorator_2.Notification;

/**
 * @author Israel I. Rodriguez E. on 20/09/2020
 */
public class WhatsappNotificationDecorator implements Notification {
    private Notification notification;

    public WhatsappNotificationDecorator(Notification notification) {
        this.notification = notification;
    }

    @Override
    public void description() {

        if (notification != null) {
            System.out.println("Notificacion enviada por Whatsapp: ");
            notification.description();
        }

    }
}
