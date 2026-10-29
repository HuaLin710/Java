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

class Exercise7_23 {
    static double sumArea(Shape[] arr) {
        double area = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] instanceof Circle)
                area += arr[i].calcArea(double arr[i].r);
            else
                area += arr[i].calcArea(double arr[i].width, double arr[i].height);
        }
        return area;
    }

    public static void main(String[] args) {
        Shape[] arr = { new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("sum Area: " + sumArea(arr));
    }
}