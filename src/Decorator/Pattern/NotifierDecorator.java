package Decorator.Pattern;

public abstract class NotifierDecorator implements Notifier {

    private Notifier component;

    public NotifierDecorator(Notifier component) {
        this.component = component;
    }

    @Override
    public void send() {
        component.send();
    }
}
