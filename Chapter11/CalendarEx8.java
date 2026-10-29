
class CalendarEx8 {
    public static void main(String[] args) {
        String date1 = "200508";
        String date2 = "200405";

        int month1 = Integer.parseInt(date1.substring(0, 4))*12 + Integer.parseInt(date1.substring(4));
        int month2 = Integer.parseInt(date2.substring(0, 4))*12 + Integer.parseInt(date2.substring(4));

        System.out.println("The difference between " + date1 + " and " + date2 + " is " + Math.abs((month2 - month1)) + " months.");
    }
}