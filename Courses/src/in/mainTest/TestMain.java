package in.mainTest;

import in.interphase.Resgistrable;

public class TestMain {
    public static void main(String[] args) {
        
        Resgistrable java=(fee,name)-> {
                         if(fee>5000){
                            System.out.println("fess paid sucesfully for :"+name);
                         }
                         else{
                            System.out.println("fess remaining");
                         }

                        // return fee;       
        };



        java.payFees(5001,"java");
        java.payFees(2000, "python");
    }




}
