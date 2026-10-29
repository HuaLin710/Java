class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if(f instanceof Unit)
        {
            System.out.println("f is the child of class Unit.");
        }

        if(f instanceof Fightable)
        {
            System.out.println("f implements the interface Fightable.");
        }

        if(f instanceof Movable)
        {
            System.out.println("f implements the interface Movable.");
        }

        if(f instanceof Attackable)
        {
            System.out.println("f implements the interface Attackable.");
        }

        if(f instanceof Object)
        {
            System.out.println("f is the child of class Object.");
        }
    }
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {}
    public void attack(Unit u) {}
}

class Unit {
    int currentHP;
    int x;
    int y;
}
interface Fightable extends Movable, Attackable {}
interface Movable { void move(int x, int y);}
interface Attackable { void attack(Unit u); }