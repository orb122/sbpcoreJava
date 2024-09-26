package in.trycatchdemo;

public class TryChatch {
    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        try{
        for (int i=0;i<=arr.length;i++){
            
            System.out.println(arr[i]);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println( "this is Finally block");
        }

        
        System.out.println("bye....");

          
        }

        



        

        
        
    }
    


