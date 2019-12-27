package AbstractFactory.Usage;

import AbstractFactory.Design.UIFactory;
import AbstractFactory.Usage.UserDesign.BoyDesign.BoyUIFactory;

public class Application {
    UIFactory UI;

    public Application() {
        //get user information then render show UI follow them
        UI = new BoyUIFactory();
    }

    public void render(){
        System.out.println(this.UI);
    }

    public static void main(String[] args){
        Application app = new Application();
        app.render();
    }
}
