import java.util.*;

class ScannerEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input ="";
        do { 
          System.out.print("Input a value. Input Q to end the input. ->");
          input = scan.nextLine();
          System.out.println("Input value is " + input);  
        } while(!input.equalsIgnoreCase("Q"));

        System.out.println("Program ends.");
    }
}