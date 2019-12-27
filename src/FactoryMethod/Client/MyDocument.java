package FactoryMethod.Client;

import FactoryMethod.Framework.*;

public class MyDocument extends Document {
    @Override
    protected void open() {
        System.out.println("Open my document");
    }
}
