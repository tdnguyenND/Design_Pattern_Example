package Prototype.Pattern;

public abstract class Prototype {
    protected int uniqueValue;

    public Prototype() {
    }

    public Prototype(int uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public Prototype(Prototype p){
        this.uniqueValue = p.uniqueValue;
    }

    public abstract Prototype clone();

}
