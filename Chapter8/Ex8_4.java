

class Exc {
    static void method() throws InvalidNumberException, NotANumberException {
        System.out.println("method exception processed.");
    }

    class NumberException extends RuntimeException {}
    class InvalidNumberException extends NumberException {}
    class NotANumberException extends NumberException {}
}

class Ex8_4 {
    public static void main(String[] args) {
        try {
            Exc.method();
        } catch (RuntimeException re) {
            System.out.println("RuntimeException");
        }
    }
}
