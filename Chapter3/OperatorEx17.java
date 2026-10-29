class OperatorEx17
{
    public static void main(String[] args) 
    {
        float pi = 3.1415926f;
        float shortPi = (int)(pi * 1000) / 1000f;
        System.out.println(shortPi);    

        float shortPi2 = Math.round(pi * 1000) / 1000f;
        System.out.println(shortPi2);
        
        float shortPi3 = Math.round(pi * 100) / 100f;
        System.out.println(shortPi3);
    }
}