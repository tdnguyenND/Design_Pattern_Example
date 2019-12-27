package FactoryMethod.Framework;

import java.util.ArrayList;

public abstract class Application {
    protected ArrayList<Document> docs;

    public Application() {
        docs = new ArrayList();
    }

    public abstract Document createNewDocument();

    public void newDocument(){
        Document doc = createNewDocument();
        docs.add(doc);
    }

    public void openDocument(){
        for (Document d: docs){
            d.open();
        }
    }
}
