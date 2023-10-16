import org.example.Rectangle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {

    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle();
        assertEquals(15, rectangle.area(3, 5));
        assertEquals(40, rectangle.area(5, 8));
        assertEquals(8, rectangle.area(2, 4));
    }

    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle();
        assertEquals(16, rectangle.perimeter(3, 5));
        assertEquals(26, rectangle.perimeter(5, 8));
        assertEquals(12, rectangle.perimeter(2, 4));
    }

    @Test
    public void testIsTriangle() {
        Rectangle rectangle = new Rectangle();
        assertTrue(rectangle.isTriangle(3, 4, 5));
        assertFalse(rectangle.isTriangle(1, 1, 3));
        assertTrue(rectangle.isTriangle(5, 12, 13));
    }
}
