import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println(Point3D.PI);
        Point3D.foo();
    }

    //  record can be used as a regular type in APIs
    static Point3D getPoint() {
        return new Point3D(4, 5, 6);
    }

    static void consumePoint(Point3D p) {

    }
}

record Point3D(int x, int y, int z) {
    //  static members (fields and methods) can be declared in a record
    public static final double PI;

    //  static initializer can also be declared like a normal class
    static {
        PI = Math.PI;
    }

    public static void foo() {
        System.out.println("Point3D#foo");
    }
}