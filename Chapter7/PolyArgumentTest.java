class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("Not enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("You bought " + p);
    }
}

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();

        Computer com = new Computer();

        b.buy(tv);
        b.buy(com);

        System.out.println("You have " + b.money + " money");
        System.out.println("You have " + b.bonusPoint + " bonus points");
    }
}