package in.assignment.clasess;

public class DecimalToBinaryAndBinaryTODecimal {
    public String decimalToBinary(int decimal){
        String binary=Integer.toBinaryString(decimal);
        return binary;
    }

    public int  binaryToDecimal(String binary){
        int decimal=Integer.parseInt(binary,2);
        return decimal;
    }

}
