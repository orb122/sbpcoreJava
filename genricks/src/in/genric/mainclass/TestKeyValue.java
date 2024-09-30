package in.genric.mainclass;

import in.genric.genricpacages.KeyValue;

public class TestKeyValue {
    public static void main(String[] args) {
        KeyValue <String,String> k1=new  KeyValue<>("Good ", "Wich is not bad");
        KeyValue <String,String> k2=new  KeyValue<>("Bad ", "Wich is not good");
        KeyValue <String,String> k3=new  KeyValue<>("Clever", "Wich is not mad");
        KeyValue <String,String> k4=new  KeyValue<>("DUMB ", "Wich is not clever");


        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
        System.out.println(k4);


        KeyValue<Long,String> phonebook= new KeyValue<>(9075320591L, "Omkar");
        KeyValue<Long,String> phonebook1= new KeyValue<>(9075320591L, "Omkar");
        KeyValue<Long,String> phonebook2= new KeyValue<>(9075320591L, "Omkar");
        KeyValue<Long,String> phonebook3= new KeyValue<>(9075320591L, "Omkar");
        KeyValue<Long,String> phonebook4= new KeyValue<>(9075320591L, "Omkar");


        System.out.println(phonebook);
        System.out.println(phonebook1);
        System.out.println(phonebook2);
        System.out.println(phonebook3);
        System.out.println(phonebook4);

    }

}
