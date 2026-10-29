class ArrayEx11
{
    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};
        int[] newNumber = new int[10];

        for(int i=0; i<number.length; i++)
        {
            System.out.print(number[i]);
        }
        System.out.println();

        for(int i=0; i<newNumber.length; i++)
        {
            System.out.print(newNumber[i]);
        }
        System.out.println();

        for(int i=0; i<number.length; i++)
        {
            newNumber[i]=number[i];
        }
        System.out.println();
        
        for(int i=0; i<newNumber.length; i++)
        {
            System.out.print(newNumber[i]);
        }
    }
}