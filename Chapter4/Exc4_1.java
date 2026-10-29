

class Exc4_1
{
    public static void main(String[] args) throws java.io.IOException
    {
        int x=System.in.read();
        System.out.println((x>10 && x<20));

        int ch=0;
        ch = System.in.read();
        System.out.println(((char)ch!=' ' && (char)ch!='\t'));
        System.out.println(((char)ch=='x' || (char)ch=='X'));
        System.out.println(((char)ch>='0' && (char)ch<='9'));

        int year=System.in.read();
        System.out.println((year%400==0) || (year%4==0 && year%100!=0));

        boolean powerOn=false;
        System.out.println(!powerOn);

        String str1="yes";
        System.out.println(str1.equals("yes"));
    }
}