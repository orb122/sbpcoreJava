package in.javapack1;

public class Car {
    private int speed;
    private int streering;

    public Car(int sp){
        speed=sp;
    }


    public void turnRight(){
        streering+=90;
    }

    public void turnLeft(){
        streering-=90;
    }
    public Car(int sp,int str){
        speed=sp;
        streering=str;
    }

    public void accelarate(){
        speed+=5;
    }
    public void applybreack(){
        speed-=20;
    }

    public void details(){
        System.out.println(speed);
        System.out.println("the stering angle is "+streering);
    }



}
