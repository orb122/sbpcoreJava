package in.abstraction.Interphase.elecbill;

public class Vi implements BillGenrator {
    @Override
    public float genrateBill(int interUsage){
        return interUsage*20;
    }

}
