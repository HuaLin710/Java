import java.io.*;

class ExceptionEx13 {
    public static void main(String[] args) {
        PrintStream ps = null;

        try {
            ps = new PrintStream("error.log");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        } catch (Exception ae) {
            ae.printStackTrace(ps);
            ps.println("Exception message: " + ae.getMessage());
        }
        System.out.println(6);
    }
}