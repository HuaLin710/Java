import java.util.*;

class CalendarEx3 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1};
        final String[] TIME_UNIT_NAME = {"hour", "minute", "second"};

        Calendar time1 = Calendar.getInstance();
        Calendar time2 = Calendar.getInstance();
        time1.set(Calendar.HOUR_OF_DAY, 10);
        time1.set(Calendar.MINUTE, 20);
        time1.set(Calendar.SECOND, 30);

        time2.set(Calendar.HOUR_OF_DAY, 20);
        time2.set(Calendar.MINUTE, 30);
        time2.set(Calendar.SECOND, 10);

        System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + " hour " + time1.get(Calendar.MINUTE) + " minute " + time1.get(Calendar.SECOND) +" second.");
        System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + " hour " + time2.get(Calendar.MINUTE) + " minute " + time2.get(Calendar.SECOND) +" second.");

        long difference = Math.abs(time1.getTimeInMillis() - time2.getTimeInMillis())/1000;
        System.out.println("Difference between time1 and time2: " + difference + " seconds.");

        String tmp = "";
        for(int i=0; i<TIME_UNIT.length; i++) {
            tmp += difference/TIME_UNIT[i] + TIME_UNIT_NAME[i];
            difference %= TIME_UNIT[i];
        }

        System.out.println("Difference between time1 and time2: " + tmp);

    }
}