package in.testmain;

import in.exceptionClasess.ExceptionDemo;

public class TestException {
    public static void main(String[] args) {
        ExceptionDemo d=new ExceptionDemo();
        System.out.println(d.division(30, 0));
        d.loadClass();
    }

}
