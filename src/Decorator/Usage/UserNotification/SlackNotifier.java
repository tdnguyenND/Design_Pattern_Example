package Decorator.Usage.UserNotification;

import Decorator.Pattern.Notifier;
import Decorator.Pattern.NotifierDecorator;

public class SlackNotifier extends NotifierDecorator {
    public SlackNotifier(Notifier component) {
        super(component);
    }

    @Override
    public void send() {
        super.send();
        System.out.println("Slack notifier has been sent");
    }
}
