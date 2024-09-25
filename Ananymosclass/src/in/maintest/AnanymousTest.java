package in.maintest;

import in.ananymos1.ArithmaticOpration;

public class AnanymousTest {
    public static void main(String[] args) {
        ArithmaticOpration a=new ArithmaticOpration() {
            @Override
            public int performOpration(int a,int b){
                return a+b;
            }
          
            
        };

        ArithmaticOpration sub=new ArithmaticOpration() {
            @Override
            public int performOpration(int a,int b){
                return a-b;

            }
        };

        ArithmaticOpration mul=new ArithmaticOpration() {
            @Override
            public int performOpration(int a,int b){
                return a*b;

            }
        };

        ArithmaticOpration div=new ArithmaticOpration() {
            @Override
            public int performOpration(int a,int b){
                return a/b;

            }
        };

        ArithmaticOpration mod=new ArithmaticOpration() {
            @Override
            public int performOpration(int a,int b){
                return a%b;

            }
        };
        
        ArithmaticOpration add=(num1,num2) -> num1+num2;
        

        System.out.println(add.performOpration(20, 20));
        System.out.println("substraction: "+sub.performOpration(20, 10));
        System.out.println("multication is :"+mul.performOpration(4, 4));
        System.out.println("divison is :"+div.performOpration(40, 2));
        System.out.println("moduling :"+mod.performOpration(10, 1));


       
    }

}
