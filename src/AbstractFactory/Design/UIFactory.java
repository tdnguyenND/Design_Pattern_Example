package AbstractFactory.Design;

public abstract class UIFactory {
    protected Window window;
    protected ScrollBar scrollBar;

    public abstract void createWindow();
    public abstract void createScrollBar();
}
