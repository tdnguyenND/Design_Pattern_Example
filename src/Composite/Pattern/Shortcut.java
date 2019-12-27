package Composite.Pattern;

public class Shortcut implements FileItem {
    @Override
    public void print() {
        System.out.println("Print shortcut " + this);
    }
}
