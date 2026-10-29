abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }
    
    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class Circle extends Shape {
    double r;

    double cartalcArea(double r) {
        super();
        this.r = r;
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    double calcArea(double width, double height) {
        super();
        this.width = width;
        this.height = height;
        return width * height;
    }

    boolean isSquare() {
        if(width==height) {
            return true;
        }
        else {
            return false;
        }
    }
}