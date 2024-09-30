package in.genric.mainclass;

import in.genric.genricpacages.Box;

public class BoxTest {
    public static void main(String[] args) {
        Box <String> strngbox=new Box<String>("ABC");
        strngbox.getContent();

        Box <Integer> intBox=new Box<Integer>(330);
        intBox.getContent();
    }

}
