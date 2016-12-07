import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class MopTest {

  Mop mop;

  @Before
  public void before() {
    mop = new Mop("Hygenic");
  }

  @Test
  public void hasBrand() {
    assertEquals("Hygenic", mop.getBrand());
  }
  
  @Test
  public void canProtect() {
    assertEquals(mop.protect(), "Step back, I've got... a mop?!");
  }
}