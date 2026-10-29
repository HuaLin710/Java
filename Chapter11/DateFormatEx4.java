import java.text.*;
import java.util.*;

class DateFormatEx4 {
    public static void main(String[] args) {
        String pattern = "yyyy/MM/dd";
        DateFormat df = new SimpleDateFormat(pattern);
        Scanner s = new Scanner(System.in);

        Date inDate = null;

        System.out.println("Please enter a date in " + pattern + " format. (example: 2007/05/11)");
        while(s.hasNextLine()) {
            try {
                inDate = df.parse(s.nextLine());
                break;
            } catch(Exception e) {
                System.out.println("Please enter a date in " + pattern + " format. (example: 2007/05/11)");
            }
        }

        Calendar cal = Calendar.getInstance();
        cal.setTime(inDate);
        Calendar today = Calendar.getInstance();
        long day = (cal.getTimeInMillis() 
                    - today.getTimeInMillis()) / (60*60*1000);
        System.out.println("The date you entered differs from now by " + day + " hours.");
    }
}