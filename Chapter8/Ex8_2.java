class Number {
    void add(int a, int b) throws InvalidNumberException, NotANumberException {}

    class NumberException extends Exception {}
    class InvalidNumberException extends NumberException {}
    class NotANumberException extends NumberException {}
}

class NumberChild1 extends Number {
    void add(int a, int b) throws InvalidNumberException, NotANumberException {}

}

class NumberChild2 extends Number {
    void add(int a, int b) throws InvalidNumberException {}
}

class NumberChild3 extends Number {
    void add(int a, int b) throws NotANumberException {}
}

class NumberChild4 extends Number {
    void add(int a, int b) throws Exception {}
}

class NumberChild5 extends Number {
    void add(int a, int b) throws NumberException {}
}

class NumberChild6 extends Number {
    void add(int a, int b) {}
}