package in.staticandfinal.finalclasess;

public final class ParentFinalClass {
    private final int CONSTANT_VALUE;           //lazy initilization work
               
    private static final int CONSTANT_VALUE1=9;   //lazy initilization not work

    public ParentFinalClass(){
        CONSTANT_VALUE=10;
    }


        public final void method1(){                      //final method can not Override 
            System.out.println("I am  final method ");
        }


        //binary to decimal
        //decimal to binary 


        //holiday final class 
        //final variable lazy intilization//indipandance day  

}
