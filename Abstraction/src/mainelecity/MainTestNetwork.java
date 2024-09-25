package mainelecity;

import in.abstraction.Interphase.elecbill.*;

public class MainTestNetwork {
    public static void main(String[] args) {
        BillGenrator v=new Vi();
        Airtel a=new Airtel();

        v.method1();
        BillGenrator.method2();


        System.out.println("Your dayly bill for today: "+a.genrateBill(10));
        System.out.println("your vi data bill: "+v.genrateBill(10));

        
    }

}
