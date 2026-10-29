class Exc4_15
{
    public static void main(String[] args)
    {
        int number=12321;
        int tmp = number;
        int result=0;
        while(tmp != 0)
        {
            int rem = tmp%10;
            result = result*10+rem;
            tmp=tmp/10;
        }

        if(number==result)
            System.out.println(number+" is palindrome.");
        else
            System.out.println(number + " is not palindrome.");
    }
}