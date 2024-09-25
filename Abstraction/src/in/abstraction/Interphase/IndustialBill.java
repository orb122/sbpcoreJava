package in.abstraction.Interphase;

public class IndustialBill extends BillE {
    // public IndustialBill (int number){
    //     super(number);

    // }
    @Override
    public float genrateBill(int units){
        float ammount= units*16.30f;
        return ammount;
    }

}
