package AbstractFactory.Usage.UserDesign.BoyDesign;

import AbstractFactory.Design.UIFactory;

public class BoyUIFactory extends UIFactory {
    public BoyUIFactory() {
        createWindow();
        createScrollBar();
    }

    @Override
    public void createWindow() {
        this.window = new BoyWindow();
    }

    @Override
    public void createScrollBar() {
        this.scrollBar = new BoyScrollBar();
    }

    @Override
    public String toString() {
        return "BoyUIFactory{" +
                "window=" + window +
                ", scrollBar=" + scrollBar +
                '}';
    }
}
