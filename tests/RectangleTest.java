import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;

    @Before
    public void setUp() throws Exception {
        rectangle = new Rectangle(10,20);
    }

    @Test
    public void getLength() {
        assertEquals(10, rectangle.getLength(),0.0);
    }

    @Test
    public void setLength() {
        rectangle.setLength(20);
        assertEquals(20,rectangle.getLength(),0.0);
    }

    @Test
    public void setLengthInvalid() {
        try {
            rectangle.setLength(-2);
            fail("length cannot be negative");
        } catch(IllegalArgumentException e)
        {
            System.out.println("caught Illegal length with message "+e.getMessage());
        }
    }

    @Test
    public void getWidth() {
        assertEquals(20, rectangle.getWidth(),0.0);
    }

    @Test
    public void setWidth() {
        rectangle.setWidth(10);
        assertEquals(10, rectangle.getWidth(), 0.0);
    }

    @Test
    public void setWidthInvalid() {
        try {
            rectangle.setLength(-10);
            fail("width must be positive");
        }catch (IllegalArgumentException e)
        {
            System.out.println("properly caught invalid width: "+e.getMessage());
        }
    }

    @Test
    public void ConstructorInvalidLength() {
        try {
            rectangle = new Rectangle(-1,20);
            fail("constructor length needs positive value");
        }catch (IllegalArgumentException e)
        {
            System.out.println("properly caught invalid length in constructor: "+e.getMessage());
        }
    }

    @Test
    public void ConstructorInvalidWidth() {
        try {
            rectangle = new Rectangle(10,-20);
            fail("constructor width needs positive value");
        }catch (IllegalArgumentException e)
        {
            System.out.println("properly caught invalid width in constructor: "+e.getMessage());
        }
    }

    @Test
    public void isSquareTestFalse() {
        assertEquals(false, rectangle.isSquare());
    }

    @Test
    public void isSquareTestTrue() {
        rectangle.setWidth(10);
        assertEquals(true, rectangle.isSquare());
    }

    @Test
    public void getArea() {
        assertEquals(200, rectangle.getArea(),0.0);
    }
}