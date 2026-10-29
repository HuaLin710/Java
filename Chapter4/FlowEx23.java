class FlowEx23
{
    public static void main(String[] args)
    {
        int i = 0;
        int sum = 0;
        while((sum += ++i) < 100)
        {
            System.out.println(i + " - " + sum);
        }
    }
}