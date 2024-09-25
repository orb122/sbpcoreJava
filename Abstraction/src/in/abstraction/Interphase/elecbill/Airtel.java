package in.abstraction.Interphase.elecbill;

public class Airtel implements BillGenrator {
    @Override
    public float genrateBill (int interUsage){
        return interUsage*20;
    }

}
