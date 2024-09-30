package in.staticandfinal.mainclass;
//we can acess static refrences Static variable from the main methid without object
//we can not  acess nonstatic method wihout any refrences 

import in.staticandfinal.clasess.StaticDemo;

public class TestMain {
    public static void method3(){
        System.out.println("I am static method in the same class ");

    }
    public static void main(String[] args) {
        StaticDemo d1=new StaticDemo();
        // StaticDemo d1=new StaticDemo();
        // StaticDemo d2=new StaticDemo();
        // StaticDemo d3=new StaticDemo();
        // StaticDemo d4=new StaticDemo();
        // StaticDemo d5=new StaticDemo();
        // StaticDemo d6=new StaticDemo();
        // StaticDemo d7=new StaticDemo();
        // StaticDemo d8=new StaticDemo();
        // StaticDemo d9=new StaticDemo();
        // d.displayValue();
        // d1.displayValue();
        // d2.displayValue();
        // d3.displayValue();
        // d4.displayValue();
        // d5.displayValue();
        // d6.displayValue();
        // d7.displayValue();
        // d8.displayValue();
        // d9.displayValue();
        for(int i=1;i<=10;i++){
            StaticDemo d11=new StaticDemo();
            d11.displayValue();
        }




        StaticDemo.myMethod();
        StaticDemo.num1=10;
        d1.methid2();
        method3();

        

    }

}
