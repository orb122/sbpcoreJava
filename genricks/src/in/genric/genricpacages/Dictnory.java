package in.genric.genricpacages;

import java.util.ArrayList;
import java.util.List;

public class Dictnory {
    private List <KeyValue<String,String>> dictionaryList=new ArrayList<>();


    public void setDictionaryList(KeyValue<String, String> dictionaryRecord) {
        dictionaryList.add(dictionaryRecord);
        
    }

    public KeyValue<String,String> getDictinory(int index){
        return dictionaryList.get(index);
    }

    public int getIndex(){
        return dictionaryList.size();
    }

}
