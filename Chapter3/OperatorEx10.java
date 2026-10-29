class OperatorEx10
{
    public static void main(String[] args) 
    {
        int a = 1000000;
        int b = 2000000;
        long c = a * b;
        System.out.println(c);

        long a1 = 1000000 * 1000000;
        long b1 = 1000000 * 1000000L;
        System.out.println(a1);
        System.out.println(b1);   
    }
}