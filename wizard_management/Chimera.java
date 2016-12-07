package wizard_management;

public class Chimera extends MythicalBeast implements Protectable {

  public Chimera(String name) {
    super(name);
  }

  public String protect() {
    return "A frenzied chimera protects you... barely!";
  }

}