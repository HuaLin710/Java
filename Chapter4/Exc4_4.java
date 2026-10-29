class Exc4_4
{
    public static void main(String[] args) {
        int sum=0;
        int fact=1;

        while (true) { 
            sum+= ((fact%2!=0) ? fact : -fact);
            if (sum>=100)
                break;
            fact++;
        }
        System.out.println(fact);
    }
}