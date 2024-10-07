package in.genric.genricpacages;

import java.util.ArrayList;
import java.util.List;

public class HolidayDate {
    private List <KeyValue<String,String>> holidayList=new ArrayList<>();


    public void setHoliday(KeyValue<String,String> holidayRecord){
        holidayList.add(holidayRecord);
    }


    public KeyValue<String,String> getHoliday(int index){
        return holidayList.get(index);
    }

    public int  getSize(){
        return holidayList.size();

    }

}
