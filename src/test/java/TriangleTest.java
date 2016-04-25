import org.junit.*;
import static org.junit.Assert.*;

public class TriangleTest {

  @Test
  public void newTriangle_exists() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle instanceof Triangle);
  }
  @Test
  public void newTriangle_isEquilateral() {
    Triangle testTriangle = new Triangle(2,2,2);
    assertEquals(true, testTriangle.isEquilateral());
  }
  @Test
  public void newTriangle_isIso() {
    Triangle testTriangle = new Triangle(2,3,2);
    assertEquals(true, testTriangle.isIso());
  }
}