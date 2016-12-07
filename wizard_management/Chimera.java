package wizard_management;

public class Chimera extends MythicalBeast implements Flyable, Protectable {

  public Chimera(String name) {
    super(name);
  }

  public String fly() {
    return "Standing up tall, beating wings, lift off!";
  }

  public String protect() {
    return "A powerful dragon protects you!";
  }

}