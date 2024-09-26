package in.exceptionClasess;

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

}
