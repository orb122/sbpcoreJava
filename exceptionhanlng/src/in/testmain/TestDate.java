package in.testmain;

//import java.text.ParseException;

import in.exceptionClasess.ThrowsDemo;

public class TestDate {
    public static void main(String[] args) {
        ThrowsDemo t=new ThrowsDemo();
    //     try{
    //    System.out.println( t.getDate("27.09.2024"));
    //     }catch(ParseException p){
    //         System.out.println(p);
    //     }
        try{


      t.setName("Omkar");  
      t.setNumber("1234567891");
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
