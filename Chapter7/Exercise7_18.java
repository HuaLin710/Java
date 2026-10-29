class Exercise7_18 {
    //function action()
    static void action(Robot r) {
        if(r instanceof DanceRobot) 
            DanceRobot.dance();
        else if(r instanceof SingRobot)
            SingRobot.sing();
        else
            DrawRobot.draw();
    }
    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

        for(int i=0; i<arr.length; i++)
        {
            action(arr[i]);
        }
    }
}

class Robot {}

class DanceRobot extends Robot {
    static void dance() {
        System.out.println("Dance");
    }
}

class SingRobot extends Robot {
    static void sing() {
        System.out.println("Sing");
    }
}

class DrawRobot extends Robot {
    static void draw() {
        System.out.println("Draw");
    }
}