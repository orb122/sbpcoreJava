package in.genric.genricpacages;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List <KeyValue<Long,String>> phoneBookList=new ArrayList<>();


    public void add(KeyValue<Long,String> phoneBookRecord){
        phoneBookList.add(phoneBookRecord);
    }

    public KeyValue<Long,String> get(int index){
        return phoneBookList.get(index);
    }

    public int size=phoneBookList.size();

}
