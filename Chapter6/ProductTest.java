class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }

    public Product() {}
}

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1's seiral No. is " + p1.serialNo);
        System.out.println("p2's seiral No. is " + p2.serialNo);
        System.out.println("p3's seiral No. is " + p3.serialNo);
    }
}
