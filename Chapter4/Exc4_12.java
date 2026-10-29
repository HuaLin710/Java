class Exc4_12
{
    public static void main(String[] args)
    {
        int i, j;
        Loop1: for(i=2; i<10; i++)
        {
            for(j=1; j<10; j++)
            {
                if(j==4)
                {
                    continue Loop1;
                }
                System.out.println(i+"*"+j+"="+i*j);
            }
        }

    }
}