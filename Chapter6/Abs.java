class Abs {
    static int abs(int value) {
        if (value < 0)
            return -value;
        else
            return value;
    }

    public static void main(String[] args) {
        
        int value=5;
        System.out.println("The absolute value of "+value+" is "+abs(value));
        value=-10;
        System.out.println("The absolute value of "+value+" is "+abs(value));
    }
}