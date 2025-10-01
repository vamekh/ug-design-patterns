package ge.edu.ug.solid.dip.notification.badexample;

import java.util.List;

public class NotificationManager {
    SmsService smsService;

    public NotificationManager(SmsService smsService) {
        this.smsService = smsService;
    }

    List<String> recipients = List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides");

    void send(SmsNotification message){
        for (String recipient : recipients) {
            smsService.send(recipient, message.toString());
        }
    }
}
