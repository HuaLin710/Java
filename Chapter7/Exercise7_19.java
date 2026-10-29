class Buyer {
    int money = 1000;
    Product[] cart = new Product[3];
    int i = 0;
    int sum = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("Not enough money to buy " + p.toString());
            return;
        }

        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if(i >= cart.length-1) {
            Product[] tmp = new Product[cart.length*2];
            System.arraycopy(cart, 0, tmp, 0, cart.length);
            cart = tmp;
        }
        cart[i++]=p;
    }

    void summary() {
        String itemList = "";

        for(int j=0; j<cart.length; j++) {
            if(cart[j]==null)
                break;
            sum += cart[j].price;
            itemList += cart[j].toString() + ", ";
        }

        System.out.println("Item list: " + itemList);
        System.out.println("Total cost: " + sum);
        System.out.println("Remaining money: " + money);
    }
}

class Product {
    int price;

    Product(int price) {
        this.price = price;
    }
}

class Tv extends Product {
    Tv() { super(100); }

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

class Audio extends Product {
    Audio() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Exercise7_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        
        b.summary();
    }
}