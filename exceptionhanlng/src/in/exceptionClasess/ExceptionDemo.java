package in.exceptionClasess;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo {
    public int division(int a,int b){
        return a/b;
        
    }

    public void loadClass(){
        try{
        Class.forName("com.mysql.driver.mysqlDriver");
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

    }

    public Date  dateFormat(String bDay)throws ParseException{
        SimpleDateFormat format=new SimpleDateFormat("dd.mm.yy");
        Date a= format.parse(bDay);
        return  a;
    }

   public void outOfBond(int... arr){
    System.out.println(arr[arr.length]);
   }

   public void stringIndexOutOfBound(String str){
    System.out.println(str.charAt(str.length()));
   }

}
