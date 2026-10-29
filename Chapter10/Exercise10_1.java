class Outer {
    class Inner {
        int iv = 100;
    }
}

class Exercise10_1 {
    public static void main(String[] args) {
        Outer ot = new Outer();
        Outer.Inner ii = ot.new Inner();
        System.out.println(ii.iv);
    }
}