import javax.swing.*;

class ArrayEx16
{
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        String temp = "";
        int count = 0;

        do {
            count++;
            temp = JOptionPane.showInputDialog("Enter a number between 1 and 100."
                +" Enter -1 to end.");

            if(temp==null || temp.equals("-1"))
                break;
            
            System.out.println("Input: "+temp);
            input = Integer.parseInt(temp);

            if(answer > input)
            {
                System.out.println("Enter a higher number");
            }
            else if (answer < input)
            {
                System.out.println("Enter a lower number");
            }
            else
            {
                System.out.println("Bingo");
                System.out.println("You have tried "+count+" times");
                break;
            }
        } while(true);
    }
}