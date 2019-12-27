package FactoryMethod.Client;

import FactoryMethod.Framework.*;

public class MyApplication extends Application {
    public MyApplication() {
    }

    @Override
    public Document createNewDocument() {
        return new MyDocument();
    }
}
