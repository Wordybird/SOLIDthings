import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.*;

public class WizardTest {

  Wizard wizard;
  Flyable broomstick;

  @Before
  public void before() {
    broomstick = new Broomstick("Nimbus", 10);
    wizard = new Wizard("Toby", broomstick);
  }

  @Test
  public void hasName() {
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void canSetRide() {
    Dragon dragon = new Dragon("Erik");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void hasBroomstick() {
    Broomstick broomstick = (Broomstick) wizard.getFlyable();
    assertEquals("Nimbus", broomstick.getBrand());
    assertEquals(10, broomstick.getSpeed());
  }

  @Test
  public void canFlyBroomstick() {
    assertEquals("mounting broom, running, skipping, flying!", wizard.fly());
  }

  @Test
  public void canFlyDragon() {
    Dragon dragon = new Dragon ("Tilly");
    Wizard wizard = new Wizard ("Thomas", dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet() {
    MagicCarpet magicCarpet = new MagicCarpet ("Red");
    Wizard wizard = new Wizard ("Richard", magicCarpet);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetProtection() {
    Dragon dragon = new Dragon("Jeff");
    wizard.setProtection(dragon);
    assertEquals("A powerful dragon protects you!", wizard.protect());
  }
  
  @Test
  public void orgeCanProtect() {
    Ogre ogre = new Ogre("Jill");
    wizard.setProtection(ogre);
    assertEquals("A fierce ogre protects you!", wizard.protect());
  }

}