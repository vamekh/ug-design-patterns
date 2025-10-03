package ge.edu.ug.solid.dip.notification.goodexample;

import java.util.List;

public class NotificationManager {
    Notifyable smsService;

    public NotificationManager(Notifyable smsService) {
        this.smsService = smsService;
    }

    List<String> recipients = List.of("Erich Gamma", "Richard Helm", "Ralph Johnson", "John Vlissides");

    void send(Message message){
        for (String recipient : recipients) {
            smsService.notify(recipient, message);
        }
    }
}
