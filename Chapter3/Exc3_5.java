class Exc3_5
{
    public static void main(String[] agrs)
    {
        int num = 333;
        System.out.println(num/10*10+1);

        //Exc3_6
        int num6 = 24;
        System.out.println(10 - num6 % 10);

        //Exc3_7
        int fahrenheit = 100;
        float celcius = (int)((5 / 9f * (fahrenheit - 32)) * 100 + 0.5) / 100f;
        float celcius1 = (int)(5f / 9 * (fahrenheit - 32) * 100 + 0.5) / 100f;

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: " + celcius);
        System.out.println("Celcius1: " + celcius1);
    }
}