class FlowEx22
{
    public static void main(String[] args) {

        //for
        /* 
        for(int i=2; i<10; i++)
        {
            for(int j=1; j<10; j++)
            {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
        */
       //while
       int i = 2;
       while(i<10)
       {
            int j = 1;
            while(j<10)
            {
                System.out.println(i+"*"+j+"="+i*j);
                j++;
            }
            i++;
       }
    }
}