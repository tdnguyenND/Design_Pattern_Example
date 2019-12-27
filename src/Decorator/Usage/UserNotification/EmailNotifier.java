package Decorator.Usage.UserNotification;

import Decorator.Pattern.Notifier;

public class EmailNotifier implements Notifier {
    @Override
    public void send() {
        System.out.println("Email notifier has been sent");
    }
}
