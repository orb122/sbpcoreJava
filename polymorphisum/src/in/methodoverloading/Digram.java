package in.methodoverloading;

public class Digram {
    private int raduis;
    private int height;
    private int width;

    public Digram(){}

    public Digram(int raduis){
        this.raduis=raduis;
    }

    public Digram(int height,int width){
       this. height=height;
        this.width=width;
    }
    public void printHeihhtWidth(){
        System.out.println("height: "+ height);
        System.out.println("width :"+width);
    }

    public void area(int raduis){
        System.out.println("area of circle is :"+(3.14*raduis*raduis));
    }
    public void area(int height,int width){
        System.out.println("area of rectangle "+(height*width));
    }

}

    

