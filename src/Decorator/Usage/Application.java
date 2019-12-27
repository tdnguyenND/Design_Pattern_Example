package Decorator.Usage;

import Decorator.Pattern.Notifier;
import Decorator.Usage.UserNotification.EmailNotifier;
import Decorator.Usage.UserNotification.FacebookNotifier;
import Decorator.Usage.UserNotification.SlackNotifier;

public class Application {
    Notifier n;

    public Application() {
        this.n = new EmailNotifier();
    }

    public void decorate(){
        n = new FacebookNotifier(n);
        n = new SlackNotifier(n);
    }

    public void sendNotification(){
        n.send();
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.decorate();
        app.sendNotification();
    }
}
