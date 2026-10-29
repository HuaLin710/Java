class CallStackTest2{
    public static void main(String[] args) {
        System.out.println("main(String[] args) starts.");
        firstMethod();
        System.out.println("main(String[] args) ends.");
    }

    static void firstMethod() {
        System.out.println("firstMethod() starts.");
        secondMethod();
        System.out.println("firstMethod() ends.");
    }

    static void secondMethod() {
        System.out.println("secondMethod() starts.");
        System.out.println("secondMethod() ends.");
    }
}