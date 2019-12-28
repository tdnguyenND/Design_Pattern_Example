package Composite.Pattern;

import java.util.ArrayList;

public class Folder implements FileItem {
    private ArrayList<FileItem> items;
    private StringBuilder headLineForChildren;

    public Folder() {
        this.items = new ArrayList<>();
        this.headLineForChildren = new StringBuilder();
    }

    private void setHeadLineForChildren(StringBuilder headLineForChildren) {
        this.headLineForChildren = new StringBuilder(headLineForChildren) ;
    }

    public void appendItem(FileItem item){
        items.add(item);
    }

    @Override
    public void print() {
        System.out.println("Print folder " + this);
        printChildren();
    }

    private void printChildren(){
        backward();//children of a folder should be written backward for a tab
        for (FileItem i: items){
            printChild(i);
        }
    }

    private void backward(){
        headLineForChildren.append("\t");
    }

    private void printChild(FileItem f){
        System.out.print(headLineForChildren);

        //if a child is folder, all of its children should be written backward FROM THE CURRENT BLANK SPACE
        if (f instanceof Folder) ((Folder) f).setHeadLineForChildren(this.headLineForChildren);

        f.print();
    }
}
