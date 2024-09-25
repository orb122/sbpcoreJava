package com.absraction;

public class Opration extends Transaction{
    public Opration(int bal){
        this.bal=bal;
    }
    @Override
    public void debitAmount(float amount){
        bal-=amount;
        System.out.println(bal);

    }
    @Override
    public void creditAmount(float amount){
        bal +=amount;
        System.out.println(bal);
        
    }

}
