import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class PlaneTest {

  Plane plane;

  @Before
  public void before() {
    plane = new Plane("Aerobus");
  }

  @Test
  public void hasName() {
    assertEquals("Aerobus", plane.getName());
  }

  @Test
  public void canFly() {
    assertEquals(plane.fly(),"Revving the engines, driving down the runway, lift off!");
  }

}