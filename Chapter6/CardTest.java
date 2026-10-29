class CardTest{
    public static void main(String[] args)
    {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 is " + c1.kind + ", " + c1.number + ", size is " + c1.width + ", " + c1.height + ".");
        System.out.println("c2 is " + c2.kind + ", " + c2.number + ", size is " + c2.width + ", " + c2.height + ".");

        System.out.println("c1's width and height are changed to 50 and 80.");

        c1.width = 50;
        c2.height = 80;

        Card.width = 120;
        Card.height = 180;

        System.out.println("c1 is " + c1.kind + ", " + c1.number + ", size is " + c1.width + ", " + c1.height + ".");
        System.out.println("c2 is " + c2.kind + ", " + c2.number + ", size is " + c2.width + ", " + c2.height + ".");
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}