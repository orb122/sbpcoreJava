package in.maintest;

import in.raperclassto.MyInteger;

public class TestRaper {
    public static void main(String[] args) {
        MyInteger m=new MyInteger();
        System.out.println("the boxing is :"+m.boxing(5));
        System.out.println("the unboxing is :"+m.unboxing(6));
        Integer s=m.stringToNumber("123");
        System.out.println(s);
    }

}
