package in.list.clasess;

public class Donation {
    private String name;
    private int ammount;


    public Donation(String name,int ammount){
        this.name=name;
        this.ammount=ammount;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setAmmaount(int ammount){
        this.ammount=ammount;
    }

    public String getName(){
        return name;
    }
    public Integer getAmmount(){
        return ammount;
    }
    public String toString(){
        return "Donation name :"+name+" Donation Ammount :"+ammount;
    }

}
