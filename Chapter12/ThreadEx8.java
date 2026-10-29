import javax.swing.JOptionPane;

class ThreadEx8 {
    static boolean inputCheck = false;
    public static void main(String[] args) throws Exception {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();
        th1.start();
        th2.start();
    }
}

class ThreadEx8_1 extends Thread {
    public void run() {
        System.out.println("You must enter a value within 10 seconds.");
        String input = JOptionPane.showInputDialog("Enter any value.");
        ThreadEx8.inputCheck = true;
        System.out.println("The value you entered is " + input + ".");
    }
}

class ThreadEx8_2 extends Thread {
    public void run() {
        for(int i=9; i>0; i--) {
            if(ThreadEx8.inputCheck) return;
            System.out.println(i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println("10 seconds have passed. Exiting the program.");
        System.exit(0);
    }
}