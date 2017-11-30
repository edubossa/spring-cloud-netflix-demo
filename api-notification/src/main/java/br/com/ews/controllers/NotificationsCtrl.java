package br.com.ews.controllers;

import br.com.ews.domain.Notification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * Created by wallace on 07/03/17.
 *
 * http://localhost:8083/notifications
 */
@RestController
@RequestMapping("/notifications")
public class NotificationsCtrl {

    Logger log = LoggerFactory.getLogger(NotificationsCtrl.class);

    @RequestMapping(method = RequestMethod.GET)
    Collection<Notification> notifications() {
        log.info("NotificationsCtrl.notifications");
        Collection<Notification> notifications = new ArrayList<>();
        notifications.add(new Notification(UUID.randomUUID().toString(), "E-MAIL"));
        notifications.add(new Notification(UUID.randomUUID().toString(), "SMS"));
        notifications.add(new Notification(UUID.randomUUID().toString(), "PUSH"));
        System.out.println(notifications);
        return notifications;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/send-mail")
    Notification sendMail() {
        log.info("NotificationsCtrl.sendMail");
        return new Notification(UUID.randomUUID().toString(), "E-MAIL");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/send-sms")
    Notification sendSMS() {
        log.info("NotificationsCtrl.sendSMS");
        return new Notification(UUID.randomUUID().toString(), "SMS");
    }

    @RequestMapping(method = RequestMethod.GET, path = "/send-push")
    Notification sendPUSH() {
        log.info("NotificationsCtrl.sendPUSH");
        return new Notification(UUID.randomUUID().toString(), "PUSH");
    }

}
