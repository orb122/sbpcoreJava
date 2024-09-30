package in.assignment.clasess;

public final class Holiday {
    private final String date;
    private final String holidayName;

    public Holiday(String date,String holidayName){
        this.date=date;
        this.holidayName=holidayName;
        
    }

    public final void displayHoliday(){

        System.out.println("The name of the holiday is the :"+holidayName);
        System.out.println("This is the  holiday in this year is :"+date);
       

    } 

}
