import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class TestClass {
    private double tol = 0.00001;
    @Test
    public void TestCIrcle() throws IOException {
        Circle circle  = new Circle(4);
        double testSquare = 4 * 4 * Math.PI;
        Assert.assertEquals(circle.square(), testSquare, tol);    }

    @Test
    public void TestSquare() throws IOException {
        Square square = new Square(5);
        double testSquare = 5 * 5;
        Assert.assertEquals(square.square(), testSquare, tol);
    }
    @Test
    public void TestRectangle() throws IOException {
       Rectangle rectangle = new Rectangle(4, 5);
        double testSquare = 4 * 5;
        Assert.assertEquals(rectangle.square(), testSquare, tol);
    }
}
