package in.exceptionClasess.project;

import java.util.Scanner;

//import in.myexception.RunTimeException;

public class CalculatorException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("Enter your choice ");
            System.out.println("__________________________");
            System.out.println("1.Addition");
            System.out.println("2.sustraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Diision");
            System.out.println("0.Stop");
             choice=sc.nextInt();


             switch (choice){
                case 1 -> addition(sc);
                case 2 -> {
                    try{
                    substraction(sc);
                    }catch(InvalidUserInputExeception e){
                        System.out.println(e);
                    }
                }
                case 3 ->multiplication(sc);
                case 4 ->{
                    try{
                    division(sc);
                    }catch(InvalidUserInputExeception e){
                        System.out.println("the second no is not zero");
                    }
                }
             }

            
        } while (choice!=0);
        sc.close();
    }
public static void addition(Scanner sc){
    System.out.print("Enter first no :");
    int a=sc.nextInt();
    System.out.println("Enter the second no :");
    int b=sc.nextInt();
    System.out.println(a+b);

}

public static void substraction(Scanner sc)throws InvalidUserInputExeception{
    System.out.print("Enter first no :");
    int a=sc.nextInt();
   
    System.out.println("Enter the second no :");
    int b=sc.nextInt();
    if(a<0||b<0)
    throw new InvalidUserInputExeception("The number not to be negative ");
    System.out.println(a-b);

}
public static void multiplication(Scanner sc){
    System.out.print("Enter first no :");
    int a=sc.nextInt();
    System.out.println("Enter the second no :");
    int b=sc.nextInt();
    System.out.println(a*b);
}

public static void division(Scanner sc)throws InvalidUserInputExeception{
    System.out.print("Enter first no :");
    int a=sc.nextInt();
    System.out.println("Enter the second no :");
    int b=sc.nextInt();

    try{
        System.out.println(a/b);
    }catch(ArithmeticException e){
        System.out.println(e);
    }
     throw new InvalidUserInputExeception("The second no is not zero");
    
}


}
