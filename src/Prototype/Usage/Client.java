package Prototype.Usage;

import Prototype.Pattern.Prototype;

public class Client {
    Prototype prototype;
    Prototype p;

    public Client() {
        prototype = new ConcretePrototype(0);
    }

    void operation(){
        p = prototype.clone();
    }

    @Override
    public String toString() {
        return "Client{" +
                "prototype=" + prototype +
                ", p=" + p +
                '}';
    }
}
