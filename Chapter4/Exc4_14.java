class Exc4_14
{
    public static void main(String[] args)
    {
        int answer=(int)(Math.random()*100)+1;
        int input=0;
        int count=0;

        java.util.Scanner s=new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("Input a number between 1 and 10.");
            input = s.nextInt();
            if(input==answer)
            {
                System.out.println("Correct! The answer is "+input);
                System.out.println("You guessed "+count+" times.");
                break;
            }
        } while(true);
    }
}