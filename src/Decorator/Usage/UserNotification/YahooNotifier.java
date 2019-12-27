package Decorator.Usage.UserNotification;

import Decorator.Pattern.Notifier;
import Decorator.Pattern.NotifierDecorator;

public class YahooNotifier extends NotifierDecorator {
    public YahooNotifier(Notifier component) {
        super(component);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Yahoo notifier has been sent");
    }
}
