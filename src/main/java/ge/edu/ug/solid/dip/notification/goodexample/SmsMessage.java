package ge.edu.ug.solid.dip.notification.goodexample;

public class SmsMessage implements Message{
    String messageText;
    public SmsMessage(String messageText) {
        this.messageText = messageText;
    }

    @Override
    public String getMessageText() {
        return messageText;
    }
}
