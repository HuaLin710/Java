import java.text.SimpleDateFormat;
import java.util.Date;

class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm::ss a");

        System.out.println("Today's date is " + date.format(today));
        System.out.println("The time is " + time.format(today));
    }
}