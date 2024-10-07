package in.genric.mainclass;

import in.genric.genricpacages.HolidayDate;
import in.genric.genricpacages.KeyValue;

public class MainHoliday {
    public static void main(String[] args) {
        HolidayDate holiday=new HolidayDate();

        holiday.setHoliday(new KeyValue<String,String>("15/8/2024", "Indipendant Day"));
        holiday.setHoliday(new KeyValue<String,String>("2/10/2024", "Mhatma Ghandi Jaynti"));
        holiday.setHoliday(new KeyValue<String,String>("7/9/2024", "Ganesh Chaturti"));


        for (int i=0;i<holiday.getSize();i++){
            System.out.println(holiday.getHoliday(i));
        }
    }

}
