import java.awt.*;
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

record Point3D(int x, int y, int z) {
    //  In case a custom validation is required
    //  Succinct form of the constructor
    //  This is also a canonical constructor (int, int, int)
    public Point3D {
        if (x < 0 || y < 0 || z < 0) {
            throw new IllegalArgumentException(String.format("Invalid point combination: %d, %d, %d", x, y, z));
        }

        //  Field initialization automatically happens after the logic written here
        //  Manual assignments are not allowed.
        //  this.x = x; //  Not allowed
    }

    //  explicit constructor can also be written
    //  but all such constructors refer to the canonical constructor
    public Point3D(int x, int y) {
        this(x, y, 0);
    }
}