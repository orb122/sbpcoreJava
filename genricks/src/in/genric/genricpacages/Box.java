package in.genric.genricpacages;

public class Box <T>{
    public T content;
    
    public Box(T content){
        this.content=content;


    }
    public T  getContent(){
        System.out.println(content);
        return content;

    }

}
