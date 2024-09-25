package com.absraction;

public abstract class Transaction {
    public int bal;
    // public Transaction(int bal){
    //     this.bal=bal;

    // }
    public abstract void creditAmount(float amount);
    public abstract void debitAmount(float amount);
}
