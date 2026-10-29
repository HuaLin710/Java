class FinallyTest3 {
    public static void main(String[] args) {
        FinallyTest3.method1();
        System.out.println("after finished method1(), back to main method.");
    }

    static void method1() {
        try {
            System.out.println("method1() called.");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("mehtod1() finally block runned.");
        }

    }
}

