package FactoryMethod.Client;

public class Main {
    MyApplication myApp = new MyApplication();
    public static void main(String[] args) {
        MyApplication myApp = new MyApplication();
        myApp.newDocument();
        myApp.openDocument();
    }
}
