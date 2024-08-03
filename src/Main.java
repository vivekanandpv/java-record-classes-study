import java.awt.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
}

record Point3D(int x, int y, int z) {
    //  instance methods can be declared (both private and public)
    private void printMessageHelper() {
        System.out.println("Point3D#printMessageHelper");
    }

    public void printMessage() {
        printMessageHelper();
    }

    //  accessors can be explicitly defined
    //  accessors should not be restrictive than the record type
    //  changing the return type of the component is not allowed
    public int x() {
        return Math.abs(x);
    }
}