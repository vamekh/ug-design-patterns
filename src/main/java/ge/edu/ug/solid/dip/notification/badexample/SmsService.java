package ge.edu.ug.solid.dip.notification.badexample;

public class SmsService {
    public void send(String recipient, String message) {
        System.out.printf("Sending sms to %s: %s", recipient, message);
    }
}
