package methodoverriding;
//The only ovride in child class 
//the metod name must be same 
//acess modifire of child must be greater than parent
//covarient return type    
//we can throw exception in parent class and that exception child class in child class 
//static method can not be override its called  method hiding 
//private method can not be override 
//constructor can not override 

public class Parent {
    public void wakaUp(){
        //SuperClass
        System.out.println("Parent woke at @7:00am");
    }

}

