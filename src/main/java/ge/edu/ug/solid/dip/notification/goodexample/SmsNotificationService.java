package ge.edu.ug.solid.dip.notification.goodexample;

public class SmsNotificationService implements Notifyable {
    @Override
    public void notify(String recipient, Message message) {
        System.out.printf("Sending SMS notification to %s: %s", recipient, message.getMessageText());
    }
}
