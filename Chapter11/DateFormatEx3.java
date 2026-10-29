import java.text.*;
import java.util.*;

class DateFormatEx3 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy MMM dd", Locale.ENGLISH);
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        try {
            Date d = df.parse("2022 Dec 31");
            System.out.println(df2.format(d));
        } catch(Exception e) {}
    }
}