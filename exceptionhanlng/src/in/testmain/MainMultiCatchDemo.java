package in.testmain;

import in.exceptionClasess.MultiCatchDemo;

public class MainMultiCatchDemo {
    
    public static void main(String[] args) {
        MultiCatchDemo m = null; 
        MultiCatchDemo m1=new MultiCatchDemo(); 
        
        
        try {
            
            m.setMessage("Omkar"); 
            m1.privateTable(10);                               
        } catch (NullPointerException ex) {
            System.out.println("Eceptin catch");
        } catch (RuntimeException ex) {
            System.out.println("Caught RuntimeException: " + ex.getMessage());
        }catch(InterruptedException ex){
            System.out.println(ex);
        }
        System.out.println("aftre Statement");
    }

}


 