package in.assignment.mainclass;

import in.assignment.clasess.DecimalToBinaryAndBinaryTODecimal;

public class TestDecimalClass {
    public static void main(String[] args) {
        DecimalToBinaryAndBinaryTODecimal conversion=new DecimalToBinaryAndBinaryTODecimal();
        System.out.println("The Binary is :"+conversion.decimalToBinary(4));

        System.out.println("The Decimal is :"+conversion.binaryToDecimal("111"));
    }


}
