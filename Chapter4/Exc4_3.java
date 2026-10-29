class Exc4_3
{
    public static void main(String[] args)
    {
        int sum=0;
        int t_sum=0;
        for(int i=1; i<=10; i++)
        {
            sum+=i;
            t_sum+=sum;
        }
        System.out.println(t_sum);
    }
}
