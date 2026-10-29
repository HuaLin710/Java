class FlowEx24
{
    public static void main(String[] args) throws java.io.IOException
    {
        int input=0;
        System.out.println("Input a sentence.");
        System.out.println("Press x to end the sentence.");
        do
        {
            input=System.in.read();
            System.out.print((char)input);
        } while(input != -1 && input !='x');
    }
}