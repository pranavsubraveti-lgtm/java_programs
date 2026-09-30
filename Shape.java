public class Shape {
    void show() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void circle() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    void rectangle() {
        System.out.println("This is a rectangle");
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.show();
        c.circle();

        r.show();
        r.rectangle();
    }
}

