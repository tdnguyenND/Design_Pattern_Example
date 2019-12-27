package Prototype.Usage;

import Prototype.Pattern.*;

public class ConcretePrototype extends Prototype {

    public ConcretePrototype(int uniqueValue) {
        super(uniqueValue);
    }

    public ConcretePrototype(ConcretePrototype other) {
        super(other);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this);
    }
}
