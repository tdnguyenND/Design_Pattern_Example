package Decorator.Usage.UserNotification;

import Decorator.Pattern.Notifier;
import Decorator.Pattern.NotifierDecorator;

public class FacebookNotifier extends NotifierDecorator {

    public FacebookNotifier(Notifier component) {
        super(component);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Facebook notifier has been sent");
    }
}
