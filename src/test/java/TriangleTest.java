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
  @Test
  public void newTriangle_isScalene() {
    Triangle testTriangle = new Triangle(2,3,4);
    assertEquals(true, testTriangle.isScalene());
  }
  @Test
  public void newTriangle_notAShape() {
    Triangle testTriangle = new Triangle(8,4,5);
    assertEquals(false, testTriangle.isTriangle());
  }
}
