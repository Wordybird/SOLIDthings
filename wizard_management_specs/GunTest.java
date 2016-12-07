import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class GunTest {

  Gun gun;

  @Before
  public void before() {
    gun = new Gun();
  }

  @Test
  public void canProtect() {
    assertEquals(gun.protect(), "Step back, I've got a gun!");
  }

}