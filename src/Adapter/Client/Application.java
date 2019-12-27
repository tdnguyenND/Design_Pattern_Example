package Adapter.Client;

public class Application {
    Extension extension;

    public Application() {
        this.extension = new Extension();
    }

    public static void main(String[] args) {
        Application app = new Application();
        int[] arr = {9, 2, 4, 0, 3, 5, 7, 1, 8, 6};
        arr = app.extension.sort(arr);
        app.extension.print(arr);
    }
}
