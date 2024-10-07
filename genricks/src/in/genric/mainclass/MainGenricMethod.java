package in.genric.mainclass;

public class MainGenricMethod {
    public static void main(String[] args) {

        MainGenricMethod.printData(10);
        MainGenricMethod.printData("Omkar");
        MainGenricMethod.printData(30.40);
        MainGenricMethod.printArrayData(new Integer []{1,2,3,4});
        MainGenricMethod.printArrayData("ABC","BBC","DDC");
        
        
    }
    //T- type
    //V- value
    //K- key
    //E- element

    public static <T> void printData(T data){
        System.out.println(data);

    }
    public static <T> void printArrayData(@SuppressWarnings("unchecked") T... arays){

        for(int i=0;i<arays.length;i++){
            System.out.print(arays[i]);   
        }


    }

}
