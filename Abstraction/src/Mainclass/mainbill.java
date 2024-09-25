package Mainclass;
import in.abstraction.Interphase.BillE;
//java.lang dose not need to import 
import in.abstraction.Interphase.IndustialBill;
import in.abstraction.Interphase.ResidecialBill;

public class mainbill {
    public static void main(String[] args) {
        BillE b=new IndustialBill();
        BillE b1=new ResidecialBill();
        // b.genrateBill(100);
        System.out.println("Industial Bill: "+b.genrateBill(1));
        System.out.println("Resedincial Bill: "+b1.genrateBill(100));
        
        
    }

}
