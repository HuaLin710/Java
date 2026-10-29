import java.util.*;
import java.text.*;

class DateFormatEx2 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(2005, 9, 3);
        Date day = cal.getTime();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("yyyy-MM-dd EEEE", Locale.ENGLISH);
        sdf3 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss.SSS", Locale.ENGLISH);
        sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a", Locale.ENGLISH);

        System.out.println(sdf1.format(day));
        System.out.println(sdf2.format(day));
        System.out.println(sdf3.format(day));
        System.out.println(sdf4.format(day));
    }
}