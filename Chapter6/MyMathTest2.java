class MyMath2 {
    long a, b;

    long add() { return a + b; }
    long substract() { return a - b; }

    static long multiply(long a, long b) { return a * b; }
    static double divide(long a, long b) { return a / b; }
}

class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2();
        mm.a = 50L;
        mm.b = 60L;
        System.out.println(mm.add());
        System.out.println(mm.substract());

        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.divide(200L, 100L));
    }
}