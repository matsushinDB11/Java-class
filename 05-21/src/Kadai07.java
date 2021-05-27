abstract class Figure {
    abstract void area();
    abstract void around();
    public void measure(){
        this.area();
        this.around();
    };
}

class Square extends Figure {
    double width, height;
    void around(){
        double res = width * 2 + height * 2;
        System.out.println(res);
    }
    void area() {
        double res = width * height;
        System.out.println(res);
    }
    public void setSize(double w, double h) {
        width = w;
        height = h;
    }
}

class Circle extends Figure {
    double radius;
    final double pi = 3.14;
    void around() {
        double res = 2 * pi * radius;
        System.out.println(res);
    }
    void area() {
        double res = Math.pow(radius, 2) * pi;
        System.out.println(res);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

public class Kadai07 {
    public static void main(String[] args) {
        Square square1 = new Square();
        square1.setSize(4.3, 6.8);
        square1.measure();
        Circle circle1 = new Circle();
        circle1.setRadius(9.7);
        circle1.measure();
    }
}
