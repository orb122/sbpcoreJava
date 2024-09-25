package in.main.java;

import in.javapack1.Car;

public class Maincar {
    public static void main(String[] args) {
        Car c=new Car(20,90);
        c.turnRight();
        c.details();
        c.accelarate();
        c.details();
        c.applybreack();
        c.details();
    }

}
