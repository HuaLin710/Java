import java.util.*;

class CalendarEx2 {
    public static void main(String[] args) {
        final String[] DAY_OF_WEEK = {"", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        date1.set(2005, 7, 15);
        System.out.println("date1 is " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)]);
        System.out.println("Today(date2) is " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]);

        long difference = (date2.getTimeInMillis() - date1.getTimeInMillis())/1000;
        System.out.println("Difference between date1 and date2 is " + difference + " seconds.");
        System.out.println("Difference in days is " + difference/(24*60*60));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + " year " + (date.get(Calendar.MONTH)+1) + " month " + date.get(Calendar.DAY_OF_MONTH) + " day.";
    }

}