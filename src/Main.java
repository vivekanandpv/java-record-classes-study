import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
class Point3DAsClass {
    private final int x;
    private final int y;
    private final int z;

    public Point3DAsClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int x() {
        return x;
    }

    public int y() {
        return y;
    }

    public int z() {
        return z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3DAsClass that = (Point3DAsClass) o;
        return x == that.x && y == that.y && z == that.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}