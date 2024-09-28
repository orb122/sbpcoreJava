package in.exceptionClasess;
public class MultiCatchDemo {
    private String message;
    public String getMessage(){
        return message;
        
    }
    public void setMessage(String message) {
        this.message = message;
    }
    
    @Override
    public String toString() {
        return "MultiCatchDemo [message=" + message + "]";
    }

    //public  void devide(int a)

    public void privateTable(int bol) throws InterruptedException{
        for(int i=1;i<bol;i++){
            Thread.sleep(1000);
            System.out.println(i*8);
        }
    }


}
