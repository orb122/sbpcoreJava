package in.testmain;

//import java.text.ParseException;

import in.exceptionClasess.ExceptionDemo;

public class TestException {
    public static void main(String[] args) {
        ExceptionDemo d=new ExceptionDemo();
       // System.out.println(d.division(30, 0));
        d.loadClass();
        try {
            System.out.println(d.dateFormat("27.09.2003"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try{

        d.outOfBond(1,2,3);
        d.stringIndexOutOfBound("omkar");
        }catch(Exception e){
            System.out.println(e);
        }
    }


}
