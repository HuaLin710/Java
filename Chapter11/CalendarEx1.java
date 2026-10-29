import java.util.*;

class CalendarEx1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("Year: " + today.get(Calendar.YEAR));
        System.out.println("Month: " + today.get(Calendar.MONTH));
        System.out.println("Week of Year: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Week of Month: " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Day of Month: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("Day of Year: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day of Week: " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("Day of Week in Moth: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("AM(0)/PM(1): " + today.get(Calendar.AM_PM));
        System.out.println("Hour(0-11): " + today.get(Calendar.HOUR));
        System.out.println("Hour(0-23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute(0-59): " + today.get(Calendar.MINUTE));
        System.out.println("Second(0-59): " + today.get(Calendar.SECOND));
        System.out.println("Millisecond(0-999): " + today.get(Calendar.MILLISECOND));
        System.out.println("TimeZone(-12~+12): " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));
        System.out.println("Last day of this month: " + today.getActualMaximum(Calendar.DATE));

    }
}