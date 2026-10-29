
import java.util.Calendar;


class CalendarEx5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.set(2005, 0, 31);
        System.out.println(toString(date));

        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));

        date.roll(Calendar.MONTH, 1);
        System.out.println(toString(date));

        date.add(Calendar.MONTH, 1);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "Y " + (date.get(Calendar.MONTH) + 1) + "M " + date.get(Calendar.DATE) + "D";
    }
}