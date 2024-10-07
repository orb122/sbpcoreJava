package in.genric.mainclass;
//Holidays key=date, value=name
// 


import in.genric.genricpacages.Dictnory;
import in.genric.genricpacages.KeyValue;

public class MainDictinory {
    public static void main(String[] args) {
        
       Dictnory nRecord =new Dictnory();

       nRecord.setDictionaryList(new  KeyValue<>("Good ", "Wich is not bad"));
       nRecord.setDictionaryList(new  KeyValue<>("Bad ", "Wich is not good"));
       nRecord.setDictionaryList( new  KeyValue<>("Clever", "Wich is not mad"));
       nRecord.setDictionaryList( new  KeyValue<>("DUMB ", "Wich is not clever"));



    for(int i=0;i<nRecord.getIndex();i++){
        System.out.println(nRecord.getDictinory(i));
    }
       
      
     

}
}
