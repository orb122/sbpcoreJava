package in.exceptionClasess;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ThrowsDemo {
    public Date getDate(String date)throws ParseException{
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd.mm.yy");
        return dateFormat.parse(date);
    }

    public void divisonOf(int a,int b){
        if(b==0)
        throw new  ArithmeticException("B in not zero");

        else
        System.out.println(a/b);
    }
    public void setName(String name)throws Exception{
        if
        (name.matches("[A-Z][a-z]{2,12}")){
            System.out.println("Vaild Name" );
        }
        else{
            throw new Exception("Invalid name");
        }

        

    }
    public void setNumber(String num)throws Exception{
        if (num.matches("[0-9]{10}")){
            System.out.println("Num is valid ");
        }else{
            throw new Exception("Number is not valid");
        }
    }

}
