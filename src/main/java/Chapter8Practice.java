import java.util.Random;

class Shape {
    public void draw() {}
    public void erase() {}
    public void a() { System.out.println("Shape.a()"); }
}

class Circle extends Shape {
    @Override
    public void draw() { System.out.println("Circle.draw()"); }
    @Override
    public void erase() { System.out.println("Circle.erase()"); }
    @Override
    public void a() { System.out.println("Circle.a()"); }
}

class Square extends Shape {
    @Override
    public void draw() { System.out.println("Square.draw()"); }
    @Override
    public void erase() { System.out.println("Square.erase()"); }
}

class Triangle extends Shape {
    @Override
    public void draw() { System.out.println("Triangle.draw()"); }
    @Override
    public void erase() { System.out.println("Triangle.erase()"); }
}

class RandomShapeGenerator {
    private Random rand = new Random();
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
}

class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] s = new Shape[10];
        // fill up the array wth shapes:
        for(int i = 0; i < s.length; i++)
            s[i] = gen.next();
        // make polymorphic method calls:
        for(Shape shp : s) {
            shp.draw();
            shp.a();
        }
    }
}

/*
练习十
 */
class Ex10 {
    void a1() {
        System.out.println("Ex10.a1()");
        a2();
    }
    void a2() { System.out.println("Ex10.a2()");}
}

class Ex10Sub extends Ex10 {
    static int i = 10;
    @Override
    void a2() { System.out.println("Ex10Sub.a2()"); }

    public static void main(String[] args) {
        Ex10Sub e = new Ex10Sub();
        // e.a1();
    }
}

public class Chapter8Practice {
}
