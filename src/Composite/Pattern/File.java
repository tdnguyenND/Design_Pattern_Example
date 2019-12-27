package Composite.Pattern;

public class File implements FileItem {
    @Override
    public void print() {
        System.out.println("Print file " + this);
    }
}
