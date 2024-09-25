package testmethodoverriding;

import methodoverriding.Parent;

public class Testmain {
    public static void main(String[] args) {
        Parent p=new Parent();
        Child c=new Child();

        p.wakaUp();
        c.sleep();
        c.wakaUp();
    }

}
