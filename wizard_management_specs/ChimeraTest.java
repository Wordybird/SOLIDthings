import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class ChimeraTest {

  Chimera chimera;

  @Before
  public void before(){
    chimera = new Chimera("Bob");
  }

  @Test
  public void hasName(){
    assertEquals("Bob", chimera.getName());
  }

  @Test
  public void canProtect() {
    assertEquals(chimera.protect(), "A frenzied chimera protects you... barely!");
  }

}