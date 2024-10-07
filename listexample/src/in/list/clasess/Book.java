package in.list.clasess;

public class Book {
    private int bookid;
    private String bopkName;


    public Book(){

    }


    public Book(int bookid, String bopkName) {
        this.bookid = bookid;
        this.bopkName = bopkName;
    }
    
    public void setBookid(int bookid,String bopkName) {
        this.bookid = bookid;
        this.bopkName=bopkName;
    }

    public int getBookid() {
        return bookid;
    }
    public String getBopkName() {
        return bopkName;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "book Id"+bookid+" book name"+bopkName;
    }

}
