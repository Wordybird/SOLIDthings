import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class HelicopterTest {

  Helicopter helicopter;

  @Before
  public void before() {
    helicopter = new Helicopter("Airwolf");
  }

  @Test
  public void hasName() {
    assertEquals("Airwolf", helicopter.getName());
  }

  @Test
  public void canFly() {
    assertEquals(helicopter.fly(),"Spinning the propellors, generating speed, lift off!");
  }

}