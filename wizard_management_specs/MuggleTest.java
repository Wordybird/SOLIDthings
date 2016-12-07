import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class MuggleTest {

  Muggle muggle;
  Flyable plane;

  @Before
  public void before() {
    plane = new Plane("Aerobus");
    muggle = new Muggle("Toby", plane);
  }

  @Test
  public void hasName() {
    assertEquals("Toby", muggle.getName());
  }

  @Test
  public void canSetRide() {
    Helicopter helicopter = new Helicopter("Airwolf");
    muggle.setRide(helicopter);
    assertEquals("Spinning the propellors, generating speed, lift off!", muggle.fly());
  }

  @Test
  public void hasPlane() {
    Plane plane = (Plane) muggle.getFlyable();
    assertEquals("Aerobus", plane.getName());
  }

  @Test
  public void canFlyPlane() {
    assertEquals("Revving the engines, driving down the runway, lift off!", muggle.fly());
  }

  @Test
  public void canFlyHelicopter() {
    Helicopter helicopter = new Helicopter ("Tilly");
    Muggle muggle = new Muggle ("Thomas", helicopter);
    assertEquals("Spinning the propellors, generating speed, lift off!", muggle.fly());
  }

  public void canSetProtection() {
    Gun gun = new Gun();
    muggle.setProtection(gun);
    assertEquals("Step back, I've got a gun!", muggle.protect());
  }

}