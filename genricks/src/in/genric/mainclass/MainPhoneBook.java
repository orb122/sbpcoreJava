package in.genric.mainclass;

import in.genric.genricpacages.KeyValue;
import in.genric.genricpacages.PhoneBook;

public class MainPhoneBook {
    public static void main(String[] args) {
        PhoneBook ph=new PhoneBook();

        ph.add(new KeyValue<>(9075320591L, "Omkar"));
        ph.add( new KeyValue<>(9075320591L, "Pankaj"));
        ph.add( new KeyValue<>(9075320591L, "Tushar"));
        ph.add( new KeyValue<>(9075320591L, "Vishal"));


        System.out.println(ph.get(1));
        for(int i=0;i<ph.size;i++){
            
        }

        

    
}

}
