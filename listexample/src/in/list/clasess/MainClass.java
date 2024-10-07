package in.list.clasess;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        List <Book> bookrecord=new ArrayList<>();
        bookrecord.add(new Book(101,"Omkar"));
        System.out.println(bookrecord.get(0));


    }

}
