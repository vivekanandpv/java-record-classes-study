import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);    //  parameters are mandatory
        Point3D p2 = new Point3D(1, 2, 3);

        System.out.println(p1 == p2);   //  false; different objects
        System.out.println(p1.equals(p2));  //  equals method is implemented by default

        //  Values are not mutable
        //  p1.x = 9;   //  error
        //  p.x(3);     //  error

        //  getting the value
        System.out.println(p1.x()); //  not as p1.x
    }

    //  record can be used as a regular type in APIs
    static Point3D getPoint() {
        return new Point3D(4, 5, 6);
    }

    static void consumePoint(Point3D p) {

    }
}

//  x, y, and z are called components of the record
//  all records inherit from java.lang.Record superclass
//  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html
//  records were introduced in Java 16
record Point3D(int x, int y, int z) {
    //  A canonical constructor, private final fields for components, getters,
    //  equals and hasCode methods are implemented behind the scenes
}