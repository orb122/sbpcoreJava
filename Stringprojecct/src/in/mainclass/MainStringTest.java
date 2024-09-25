package in.mainclass;
//object class is parent class of all class 

public class MainStringTest {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder();
        //String Buffer used in single Threadee operation 
        s.append("ABC");
        s.append(" BBC");
        System.out.println(s.toString());
        String name="Omkar";
        String no="67907532053";

//6789 first mobaile no digit 
        System.out.println(name.matches("[A-Z][a-z]{1,14}"));
        System.out.println(no.matches("[6-9][0-9]{9}"));
    }

}
