import java.util.*;

class Ex8_8 {
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;
        int count = 0;

        do {
            count++;
            System.out.println("input a number between 1 and 100: ");

            try {
                input = new Scanner(System.in).nextInt();
                if (answer > input) {
                    System.out.println("higher");
                } else if (answer < input) {
                    System.out.println("lower");
                } else {
                    System.out.println("correct");
                    System.out.println("count: " + count);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, try again.");
            }
        } while (true);
    }
}