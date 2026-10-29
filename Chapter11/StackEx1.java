import java.util.*;

public class StackEx1 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1. Nate");
        goURL("2. Yahoo");
        goURL("3. Naver");
        goURL("4. Daum");

        printStatus();

        goBack();
        System.out.println("= after go back button =");
        printStatus();

        goForward();
        System.out.println("= after go forward button =");
        printStatus();

        goURL("javachobo.com");
        System.out.println("= after move to new address =");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back: " + back);
        System.out.println("forward: " + forward);
        System.out.println("current address: " + back.peek());
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if(!forward.empty())
            forward.clear();
    }

    public static void goForward() {
        if(!forward.empty())
            back.push(forward.pop());
    }

    public static void goBack() {
        if(!back.empty()) 
            forward.push(back.pop());
    }
}