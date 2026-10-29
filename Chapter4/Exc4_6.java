class Exc4_6
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 0;
        int sum = 0;

        for(a=1; a<=6; a++)
        {
            for(b=1; b<=6; b++)
            {
                sum = a + b;
                if(sum==6)
                    System.out.println("a: "+a+", b: "+b);
            }
        }
    }
}