import java.text.*;
import java.util.*;

class DateFormatEx1 {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
        SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;

        sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        sdf2 = new SimpleDateFormat("''yy MMM dd, EEEE", Locale.ENGLISH);
        sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a", Locale.ENGLISH);

        sdf5 = new SimpleDateFormat("'Today is the' D 'day of the year.'");
        sdf6 = new SimpleDateFormat("'Today is the' d 'day of the month.'");
        sdf7 = new SimpleDateFormat("'Today is the' w 'week of the year.'");
        sdf8 = new SimpleDateFormat("'Today is the' W 'week of the month.'");
        sdf9 = new SimpleDateFormat("'Today is the' F 'th ' EEEE ' of the month.'", Locale.ENGLISH);

        System.out.println(sdf1.format(today));
        System.out.println(sdf2.format(today));
        System.out.println(sdf3.format(today));
        System.out.println(sdf4.format(today));
        System.out.println();
        System.out.println(sdf5.format(today));
        System.out.println(sdf6.format(today));
        System.out.println(sdf7.format(today));
        System.out.println(sdf8.format(today));
        System.out.println(sdf9.format(today));
    }
}