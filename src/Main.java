//  x, y, and z are called components of the record
//  all records inherit from java.lang.Record superclass
//  https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/Record.html
//  records were introduced in Java 16
record Point3D(int x, int y, int z) {
    //  A canonical constructor, private final fields for components, getters,
    //  equals and hashCode methods are implemented behind the scenes
    //  toString is also provided
    //  equals, hashCode, and toString can be overridden like normal classes
}

//  record class is implicitly final.
//  It cannot be extended, either by another record or by a class

//record Point2D(int x, int y) extends Point3D {
//
//}

//class Foo extends Point3D {
//
//}

//  record classes can implement interfaces, however
//  annotations can be applied to a record class and its components

//  A record class can be used in the permitted clause of the sealed class

//  A record class can be serialized and deserialized, but the process cannot be
//  customized by providing writeObject, readObject, readObjectNotData,
//  writeExternal,readExternal methods. Components govern serialization
//  while the canonical constructor governs the deserialization

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

        System.out.println(p1); //  toString() is automatically provided
    }

    //  record can be used as a regular type in APIs
    static Point3D getPoint() {
        return new Point3D(4, 5, 6);
    }

    static void consumePoint(Point3D p) {

    }
}


