package in.abstraction.Interphase.elecbill;

public interface BillGenrator {
    public abstract float genrateBill(int interUsage);

    default void method1(){
        System.out.println("This is default method ");
        method3();

    }

    public static void method2(){
        System.out.println("I am static method ");

    }

    private void method3(){
        System.out.println("I am private method");
    }


}
