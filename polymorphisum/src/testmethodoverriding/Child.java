package testmethodoverriding;

import methodoverriding.Parent;

public class Child extends Parent {
    public void sleep(){
        System.out.println("child sleep at 10 pm ");
    }
    @Override
    public void wakaUp(){
        System.out.println("child woke at 12:00 am");
    }

}
