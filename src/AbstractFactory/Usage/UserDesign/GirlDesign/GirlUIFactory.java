package AbstractFactory.Usage.UserDesign.GirlDesign;

import AbstractFactory.Design.UIFactory;

public class GirlUIFactory extends UIFactory {

    public GirlUIFactory() {
        createWindow();
        createScrollBar();
    }

    @Override
    public void createWindow() {
        this.window = new GirlWindow();
    }

    @Override
    public void createScrollBar() {
        this.scrollBar = new GirlScrollBar();
    }
}
