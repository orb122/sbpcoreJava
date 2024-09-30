package in.staticandfinal.clasess;


public class StaticDemo {
    public static  int num1;
    public static  int staticCounter;
    public int instanceCaounter=0;
    static {
        //System.out.println("I am staic block ");

        staticCounter=0;


    }

    public StaticDemo(){
        staticCounter++;
        instanceCaounter++;
        
    }

    public void displayValue(){
        System.out.println("Instance Counter :"+instanceCaounter);
        System.out.println("Static counter  :"+staticCounter);
    }



public  static  void  myMethod(){
    StaticDemo s=new StaticDemo();
    System.out.println("I am static method ");
    s.methid2();




}

public void methid2(){
    System.out.println("I am non static method");
    
}

//the outer class does not to be static
//we can not define static in method
 

}
