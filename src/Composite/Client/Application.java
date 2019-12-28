package Composite.Client;

import Composite.Pattern.File;
import Composite.Pattern.FileItem;
import Composite.Pattern.Folder;
import Composite.Pattern.Shortcut;

import java.util.ArrayList;

public class Application {
    ArrayList<FileItem> root;

    public Application() {
        root = new ArrayList<>();
    }

    void decorate(){
        Folder f1 = new Folder();
        Folder f2 = new Folder();
        File file1 = new File();
        File file2 = new File();
        File file3 = new File();
        Shortcut sc1 = new Shortcut();
        Shortcut sc2 = new Shortcut();

        f2.appendItem(file3);
        f2.appendItem(sc1);

        f1.appendItem(file1);
        f1.appendItem(f2);

        root.add(f1);
        root.add(file2);
        root.add(sc2);

        Folder f3 = new Folder();
        File file4 = new File();
        f3.appendItem(file4);

        f2.appendItem(f3);
    }

    void render(){
        for (FileItem i: root){
            i.print();
        }
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.decorate();

        app.render();
    }
}
