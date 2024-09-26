package in.raperclassto;
//*  Advantages  */
//we have inbulid mwthod for raper class 
//we can assign null values to datatype
//when we use only object in java 


/* Disadvantage  */
//more memory space 
//more time consuming 



public class RaperClass {
    public static void main(String[] args) {
        
    
    int num1=5;
    Integer num2=(num1);      //autoBoxing Integer.valueOf(num1);
    System.out.println(num2);

    int num3=num2;           //AutoUnboxing num1.intValue() 
    System.out.println(num3);

    int re=Integer.compare(25, 1);
    System.out.println(re);

}
}